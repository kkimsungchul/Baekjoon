class Solution {
    public int[] solution(long n) {
        int length = (int)(Math.log10(n)+1);
        int[] answer = new int[length];
        int count=0;
        for(int i=length-1;i>=0;i--){
            //System.out.println(n);
            if(n/10!=0){
                answer[count] = (int)(n%10);
                n = n/10;
                count++;    
            }else{
                answer[count] =(int)n;
            }
            
        }
        
        return answer;
    }
}