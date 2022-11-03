class Solution {
    public int[] solution(int n, int s) {
        int[] answer = {};
        
        //만들지 못하는 수 계산
        if(s/n==0){
            answer = new int[1];
            answer[0]=-1;
            return answer;
        }else{
            answer = new int[n];
        }
        //계산 시작
        
        int quotient  = s/n;
        int remainder = s%n;
        //99 ,5 -> 19, 4 

        if(remainder==0){
            for(int i=0;i<n;i++){
                answer[i]=quotient;
            }
        }else{
            for(int i=n-1;i>=0;i--){
                if(remainder>0){
                    answer[i]=quotient+1;
                    remainder--;
                }else{
                    answer[i]=quotient;    
                }
                
            }
        }
        
        //System.out.println("quotient : " + quotient);
        //System.out.println("remainder : " + remainder);
        
        return answer;
    }
}