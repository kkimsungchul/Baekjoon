import java.util.*;

class Solution {
    public String solution(int n) {
        String answer = "";
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(true){
            
            if(n>3){
                int temp=n%3;
                n=n/3;
                if(temp==0){
                    n=n-1;
                    temp=3;
                }
                list.add(temp);
            }else{
                list.add(n);
                break;
            }
            
        }
        //System.out.println(list);
        for(int i=list.size()-1;i>=0;i--){
            if(list.get(i)==3){
                answer+=4;
            }else{
                answer+=list.get(i);
            }
            
        }
        return answer;
    }
    
    public String notation(int a){
        
        return "";
    }
}