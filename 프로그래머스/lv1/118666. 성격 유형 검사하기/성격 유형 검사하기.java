class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        int sum [] = {0,0,0,0};
        
        for(int i=0;i<survey.length;i++){
            
            if(survey[i].equals("RT") || survey[i].equals("TR")){
                int count =0;
                count=4-choices[i];
                if(survey[i].equals("RT")){
                    sum[0]+=count; 
                }else{
                    sum[0]-=count;
                }
                
                
            }else if (survey[i].equals("CF") || survey[i].equals("FC")){
                int count =0;
                count=4-choices[i];
                if(survey[i].equals("CF")){
                    sum[1]+=count; 
                }else{
                    sum[1]-=count;
                }
                
            }else if (survey[i].equals("JM") || survey[i].equals("MJ")){
                int count =0;
                count=4-choices[i];

                if(survey[i].equals("JM")){
                    sum[2]+=count; 
                }else{
                    sum[2]-=count;
                }
                
            }else if (survey[i].equals("AN") || survey[i].equals("NA")){
                int count =0;
                count=4-choices[i];

                if(survey[i].equals("AN")){
                    sum[3]+=count; 
                }else{
                    sum[3]-=count;
                }
            }
            
        }
        for(int i=0;i<sum.length;i++){
            System.out.println("###i : " + i);
            System.out.println(sum[i]);
            if(sum[i]<0){
                if(i==0){
                    answer+="T";
                }else if(i==1){
                    answer+="F";
                }else if(i==2){
                    answer+="M";
                }else if(i==3){
                    answer+="N";
                }
            }else {
                if(i==0){
                    answer+="R";
                }else if(i==1){
                    answer+="C";
                }else if(i==2){
                    answer+="J";
                }else if(i==3){
                    answer+="A";
                }
                

            }
        }
        
        return answer;
    }
}