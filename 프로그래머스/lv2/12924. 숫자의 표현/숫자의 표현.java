class Solution {
    public int solution(int n) {
        int answer = 0;
        int divide =1;
        while(n>0){
            
            if(n%divide==0){
                answer++;    
            }
            n-=divide;
            divide++;
        }
        return answer;
    }
}