class Solution {
    public int solution(int n) {
        int answer = 0;
        int first=0;
        int second=1;
        int temp=0;
        
        
        
        for(int i=1;i<n;i++){
            temp=first%1234567+second%1234567;
            first =second;
            second = temp;
            
        }
        answer = second%1234567 ;
        return answer;
    }
}