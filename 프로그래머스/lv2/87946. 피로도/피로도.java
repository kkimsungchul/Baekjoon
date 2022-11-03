import java.util.*;

class Solution {
    boolean check[];
    int answer;
    
    public int solution(int k, int[][] dungeons) {
        int count=0;
        int temp=0;
        answer = 0;
        check = new boolean[dungeons.length];
        
        fatigueCalculator(count,dungeons,k);
        return answer;
    }
    
    public void fatigueCalculator(int count,int[][] dungeonsn,int k){
       
        for(int i=0;i<dungeonsn.length;i++){
            if(!check[i] && dungeonsn[i][0]<=k){
                check[i] = true;
                fatigueCalculator(count+1,dungeonsn,k-dungeonsn[i][1]);
                check[i] = false;
            }
        }
        
        if(count>answer){
            answer=count;
        }
    }
}