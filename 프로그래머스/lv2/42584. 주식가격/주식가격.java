class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        int intArr[] = new int[prices.length];
        int count=0;
        boolean pass =false;
        for(int i=0;i<prices.length-1;i++){
            for(int j=i+1;j<prices.length;j++){
                count++;
                if(prices[i]>prices[j]){
                    intArr[i]=count;
                    count=0;
                    pass=true;
                    break;
                }
            }
            //System.out.println("### i : " + i + " pass : " + pass);
            if(!pass){
                
                intArr[i]=count;
                count=0;    
            }else{
                pass=false;
            }
            
        }
        
        return intArr;
    }
}