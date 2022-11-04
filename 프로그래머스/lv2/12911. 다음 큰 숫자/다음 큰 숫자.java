class Solution {
    public int solution(int n) {
        int answer=0;
        int oneCount = Integer.bitCount(n);

        while(true){
            n++;
            int tempOneCount = Integer.bitCount(n);
            if(oneCount==tempOneCount){
                answer=n;
                break;
            }

        }

        return answer;
    }
}