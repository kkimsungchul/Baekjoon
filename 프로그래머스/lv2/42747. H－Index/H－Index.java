import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer=0;
        Integer[] intArray = new Integer[citations.length];
        
        for(int i = 0; i < citations.length; i++){
            intArray[i] = citations[i];
        }
        
        Arrays.sort(intArray, Collections.reverseOrder());
        System.out.println(Arrays.toString(intArray));
        
        for(int i=0;i<intArray.length;i++){
            if(intArray[i]<i+1){
                
                return i;
            }
            
        }
        
        return intArray.length;
    }
}