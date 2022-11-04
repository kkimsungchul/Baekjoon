class Solution {
    public long solution(long n) {
        long answer = 0;
        boolean check=false;
        for(long i =1;i<=n;i++){
            if(i*i==n){
                answer = (i+1)*(i+1);
                check=true;
                break;
            }
        }
        if(!check){
            answer=-1;
        }
        return answer;
    }
}