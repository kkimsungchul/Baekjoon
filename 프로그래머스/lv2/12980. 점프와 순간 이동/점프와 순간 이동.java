import java.util.*;

public class Solution {
    public int solution(int n) {
        int ans = 0;
        int jump=0;
        int temp=n;
        while(true){
            if(temp%2==0){
                temp=temp/2;
            }else{
                temp=temp/2;
                ans++;
            }
            
            if(temp==0){
                break;
            }
            
        }
        

        return ans;
    }
}