class Solution {
    public int[] solution(int[] sequence, int k) {
        
        //13
        //1 2 3 10 
        //1 2 3 16
        int[] answer = {0,sequence.length};
        int start =0;
        int end =sequence.length;
        int sum=0;
        for(int i=0; i<sequence.length; i++){
            sum +=sequence[i];
            if(sum>k){
                while(sum>k){
                    sum-= sequence[start];
                    start += 1;
                }
            }
            if(sum==k){
                int nowLength = answer[1] - answer[0];
                if(nowLength>(i-start)){
                    end = i;
                    answer[0] = start;
                    answer[1] = end;    
                }
            }
        }
        
        return answer;
    }
}