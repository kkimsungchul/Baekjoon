class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int h=0;
        int l=0;
        int []useNumber={};
        int count=0;
        for(int i=0;i<lottos.length;i++){
            for(int j=0;j<win_nums.length;j++){
                if(lottos[i]==win_nums[j]){

                    l++;
                    h++;
                }
            }
            if(lottos[i]==0){
                count++;
            }
        }
         h +=count;
        
        
        int[] answer = {aa(h),aa(l)};
        
        return answer;
    }
    public int aa(int g){
        if(g==6){
            return 1;
        }else if(g==5){
            return 2;
        }else if(g==4){
            return 3;
        }else if(g==3){
            return 4;
        }else if(g==2){
            return 5;
        }else{
            return 6;
        }
        
    }
}