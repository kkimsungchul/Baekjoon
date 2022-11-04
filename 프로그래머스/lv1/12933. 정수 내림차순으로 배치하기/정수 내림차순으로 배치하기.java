import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        int length = (int)(Math.log10(n)+1);
        long arr[] = new long[length];
        int count=0;
        for(int i=length;i>=0;i--){
            
            if(n/10!=0){
                
                arr[count]=n%10;
                n = n/10;
                count++;
            }else{
                arr[count]=n;
            }
        }
        Arrays.sort(arr);
        //System.out.println(Arrays.toString(arr));
        String temp="";
        for(int i=length-1;i>=0;i--){
            temp+=arr[i];
        }
        //System.out.println(temp);
        
        return Long.parseLong(temp);
    }
}