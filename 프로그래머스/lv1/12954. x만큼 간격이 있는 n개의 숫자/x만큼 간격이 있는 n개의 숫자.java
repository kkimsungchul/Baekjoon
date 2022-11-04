class Solution {
    public long[] solution(int a, int n) {
        long x=a;
        long[] answer = new long[n];
        int index=0;
        
        if(x>0){
            for(long i=x;i<=x*n;i=i+x){
                answer[index] =i;
                index++;
            }    
        }else if(x<0){
            for(long i=x;i>=x*n;i=i+x){
                answer[index] =i;
                index++;
            }            
        }else{
            for(int i=0;i<index;i++){
                answer[index]=0;
            }
        }
        
        
        return answer;
    }
}