import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int temp=0;
        for(int i=0;i<answer.length;i++){
            int [] tempArray = new int[commands[i][1]-commands[i][0]+1];
            for(int j=commands[i][0]-1;j<=commands[i][1]-1;j++ ){
                tempArray[temp]=array[j];
                temp++;
            }
            Arrays.sort(tempArray);
            answer[i] = tempArray[commands[i][2]-1];
            temp=0;
            
            
        }
        
        
        return answer;
    }
}