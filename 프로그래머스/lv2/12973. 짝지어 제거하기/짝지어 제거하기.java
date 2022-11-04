import java.util.*;

class Solution
{
    public int solution(String s){
        int answer = -1;
        
        ArrayList<Character> arr = new ArrayList<Character>();
        
        for(int i=0;i<s.length();i++){
            if(arr.size()==0){
                arr.add(s.charAt(i));
            }else{
                if(arr.get(arr.size()-1)==s.charAt(i)){
                    arr.remove(arr.size()-1);
                }else{
                    arr.add(s.charAt(i));
                }
            }
            
        }
        
        answer = (arr.size()>0) ? 0 : 1;
        

        
        return answer;
    }
}