import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        int index=1;
        for(int i=1; i<arr.length; i++){
            if(arr[i]!=arr[i-1]){
                index++;
            }
        }
        
        int[] answer = new int[index];
        int count=0;
        for(int i=1; i<arr.length; i++){
            if(arr[i]!=arr[i-1]){
                answer[count] = arr[i-1];
                count++;
                answer[count] = arr[i];
                
            }
        }
        
        

        return answer;
    }
}