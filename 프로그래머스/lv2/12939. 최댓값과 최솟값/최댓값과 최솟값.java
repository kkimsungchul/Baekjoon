import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String tempString[] = s.split(" ");
        int arr []=new int[tempString.length];
        
        for(int i=0;i<tempString.length;i++){
            
            if(tempString[i].indexOf("-")==0){
                String temp = tempString[i].substring(1);
                arr[i] = Integer.parseInt(temp);
                arr[i]  = arr[i] *-1;
            }else{
                arr[i] = Integer.parseInt(tempString[i]);
            }
            
        }
        Arrays.sort(arr);
        
        
        answer = arr[0]+" "+arr[arr.length-1];
        return answer;
    }
}