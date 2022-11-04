import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        Arrays.sort(arr);
        int max = arr[arr.length-1];
        System.out.println(max);
        
        while(true){
            
            for(int i=0;i<arr.length-1;i++){
                
                if(max%arr[i]!=0){
                    break;
                }else if(i==arr.length-2){
                    return max;
                }
            }
            max = max+arr[arr.length-1];
            
        }

    }
}