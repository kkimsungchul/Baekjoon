import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        HashSet<String> hashSet = new HashSet();
        String lastChar ="";
        int userNumber =1;
        int loopCount = 1;
        //contains
        //add
        for(int i=0; i<words.length;i++){
            if(i!=0){
                if(hashSet.contains(words[i])){
                    answer[0] = userNumber;
                    answer[1] = loopCount;
                    return answer;
                }else{
                    hashSet.add(words[i]);
                }
                

                if(!lastChar.equals(words[i].substring(0,1))){
                    answer[0] = userNumber;
                    answer[1] = loopCount;
                    return answer;
                }else{
                    lastChar = words[i].substring(words[i].length()-1);
                }
                
                
            }else{
                lastChar = words[i].substring(words[i].length()-1);
                hashSet.add(words[i]);
            }
            
            userNumber++;
            if(userNumber>n){
                userNumber=1;
                loopCount++;
            }
            
        }

        return answer;
    }
}