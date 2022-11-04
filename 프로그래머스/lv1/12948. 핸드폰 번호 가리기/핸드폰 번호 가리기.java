class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int length = phone_number.length();
        String number = phone_number.substring(phone_number.length()-4);
        String asterisk ="";
        
        for(int i=0;i< phone_number.length()-4;i++){
            asterisk+="*";
        }
        
        //System.out.println(number);
        answer = asterisk + number;
        return answer;
    }
}