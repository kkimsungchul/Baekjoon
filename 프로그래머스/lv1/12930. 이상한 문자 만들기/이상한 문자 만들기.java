class Solution {
    public String solution(String s) {
        String answer = "";
        boolean odd=false;//true 짝수 false 홀수
        
        //65a - 90z , 97A - 122Z
        for(int i=0;i<s.length();i++){
            
            //공백일경우
            if(s.charAt(i)==' '){
                answer+=" ";
                odd=false;
            //공백이 아닐경우
            }else{
                //짝수차례
                if(odd){
                    
                    //소문자
                    if(s.charAt(i)<91){
                        answer += (char)(s.charAt(i)+32);  
                    }else{
                        answer += s.charAt(i);  
                    }
                    odd=false;
                //홀수차례
                }else{
                    //소문자
                    if(s.charAt(i)>90){
                        answer += (char)(s.charAt(i)-32);  
                    }else{
                        answer += s.charAt(i);  
                    }                    
                    
                    odd=true;
                }
                
                
                
            }
            
            
        }

        return answer;
    }
}