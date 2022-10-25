import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int userEnd=people.length-1;
        int userStart=0;
        Arrays.sort(people);
        
        while(userStart<=userEnd){
            if(people[userStart] +people[userEnd]<=limit){
                userStart++;
                userEnd--;
                answer++;
            }else{
                userEnd--;
                answer++;
            }
            
        }
        
        
        
        
        return answer;
    }
}