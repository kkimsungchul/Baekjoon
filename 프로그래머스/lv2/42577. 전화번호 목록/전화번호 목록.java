import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        HashMap<String , Integer> map = new HashMap<>();
        for(String a : phone_book){
            map.put(a,0);
        }
        
        for(int i=0;i<phone_book.length;i++){
            
            for(int j=1;j<phone_book[i].length();j++){
                
                if(map.containsKey(phone_book[i].substring(0,j))){
                    return false;
                }
                
                
            }
            
        }
        
        return answer;
    }
}