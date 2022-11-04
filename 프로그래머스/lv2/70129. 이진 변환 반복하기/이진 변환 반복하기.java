import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = {1,0};
        int oneCount=0;
        
        //반복
        while(true){
            
            //문자열 s에서 0과 1의 갯수를 추출
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='0'){
                    answer[1]++;
                }else{
                    oneCount++;
                }
            }
            //숫자1의 갯수를 2진수로 변환
            s = Integer.toBinaryString(oneCount);
            oneCount=0;
            
            //문자열 s가 1이면 중지
            if(s.equals("1")){
                break;
            
            //아닐경우 다시 반복
            }else{
                answer[0]++;
            }
            
        }

        return answer;
    }
}