class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int big=0;
        int small=0;
        
        if(n>m){
            big=n;
            small=m;
        }else{
            big=m;
            small=n;
        }
        
        for(int i=1;i<=small;i++){
            
            if(n%i+m%i==0){
                answer[0]=i;
            }
        }
        
        for(int i=big;i<=small*big;i=i+big){
            
            if(i%small==0){
                answer[1]=i;
                break;
            }
            
        }
        
        
        return answer;
    }
}