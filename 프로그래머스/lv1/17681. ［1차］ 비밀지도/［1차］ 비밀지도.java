class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[arr1.length];
        int size = arr1.length;
        
        for(int i=0;i<n;i++){
            //10진수를 2진수로 변환
            String temp1 = Integer.toBinaryString(arr1[i]);
            String temp2 = Integer.toBinaryString(arr2[i]);
            
            //빈 앞에 자리수를 0으로 채움
            temp1 = addZero(temp1,size);
            temp2 = addZero(temp2,size);
            
            //2진수로 변환한 값을 잘라서 배열에 하나씩 저장
            String arrTemp1[] = temp1.split("");
            String arrTemp2[] = temp2.split("");
            String returnString ="";
            
            //2진수 배열만큼 for문을 돌면서 리턴할 지도를 그림
            for(int j=0;j<arrTemp1.length;j++){
                
                if(arrTemp1[j].equals("1")){
                    returnString+="#";
                }else if(arrTemp2[j].equals("1")){
                    returnString+="#";
                }else{
                    returnString+=" ";
                }
            }
            
            answer[i] = returnString;
        }
        
        return answer;
    }
    
    
    //이진수 변환 후 앞의 빈자리를 0으로 채워줌
    public String addZero(String s , int size){
        while(true){
            if(s.length()<size){
                s = "0"+s;
            }else{
                break;
            }
        }
        
        return s;
    }
    
    
}