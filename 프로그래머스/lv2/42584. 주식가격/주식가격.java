class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        int count =0;
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                if(prices[i]>prices[j]){
                    count++;
                    break;
                }else{
                    count++;
                }
            }
            answer[i]=count;
            count=0;
            
            
        }
        
        
        return answer;
    }
}