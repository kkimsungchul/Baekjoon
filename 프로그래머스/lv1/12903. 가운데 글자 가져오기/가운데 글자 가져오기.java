class Solution {
    public String solution(String s) {
        String answer = "";
        
        int stringLength = s.length();
        if(stringLength%2==0){
            //System.out.println(s.substring(stringLength/2-1,stringLength/2+1));
            answer = s.substring(stringLength/2-1,stringLength/2+1);
        }else{
            //System.out.println(s.substring(stringLength/2,stringLength/2+1));
            answer=s.substring(stringLength/2,stringLength/2+1);
        }
        
        
        return answer;
    }
}