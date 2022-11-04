class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        //int length = (int)( Math.log10(x)+1);
        int init=x;
        int sum = 0;
        while(x!=0){
            if(x>=10){
                sum += x%10;
                x = x/10;
            }else{
                sum+=x;
                x = x/10;
            }
        }
        
        
        if(init%sum==0){
            answer=true;
        }
        return answer;
    }
}