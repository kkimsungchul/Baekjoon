class Solution {
    public int solution(String s) {
        int answer = 0;
        int multiply = 1;
        if(s.substring(0,1).equals("-")){
            multiply = -1;
            s= s.substring(1);
            
        }
        
        return Integer.parseInt(s)*multiply;
        
        
        
    }
}