import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer;
        int min = 0;
        int index=0;
        //배열의 길이가 1인경우
        if(arr.length==1){
            answer = new int[1];
            answer[0] = -1;
        }else{
            answer = new int[arr.length-1];
            for(int i=0;i<arr.length;i++){
                if(i==0){
                    min = arr[i];
                }else{
                   if(min>arr[i]) {
                       min = arr[i];
                       index=i;
                   }
                }
            }
   
            for(int i=index;i<arr.length-1;i++){
                arr[i] = arr[i+1];
            }
            
            for(int i=0;i<answer.length;i++){
                answer[i]=arr[i];
            }
            
            
        }
        
        return answer;
    }
}