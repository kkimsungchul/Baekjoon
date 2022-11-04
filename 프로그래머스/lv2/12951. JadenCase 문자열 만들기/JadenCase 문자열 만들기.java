class Solution {
    public String solution(String s) {
        String answer = "";
        int spaceIndex=0;
        for(int i=0;i<s.length();i++){
            
            if(i==spaceIndex){
                answer +=String.valueOf(s.charAt(i)).toUpperCase();
            }else{
                answer +=String.valueOf(s.charAt(i)).toLowerCase();
            }
            
            if(s.charAt(i)==' '){
                spaceIndex=i+1;
            }
            
        }
        
        
        System.out.println(s);
        return answer;
    }
}