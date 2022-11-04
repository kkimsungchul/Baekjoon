class Solution {
    public long solution(int n) {
        long answer = 0;
        //n=1 일때 1
        //n=2 일때 2
        //n=3 일때 3
        //n=4 일때 5
        //n=5 일때 8
        long a = 0;
        long b = 1;
        
        for(int i=0;i<n;i++){
            answer=a+b;
            a=b%1234567;
            b=answer%1234567;
        }
        
        return answer%1234567;
    }
}