import java.util.*;

class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char arr[] = s.toCharArray();
        // char arr[] = new char[s.length()];
        // for(int i=0;i<s.length();i++){
        //     arr[i] = s.charAt(i);
        // }
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]==' '){
                answer+= " ";
            }else{
                //65A 90Z , 97a 122z
                
                //대문자
                if(arr[i]<91){
                    int temp = arr[i]+n;
                    if(temp>90){
                        temp = temp-90+64;
                        answer += (char)temp;
                    }else{
                        answer += (char)(arr[i]+n);    
                    }
                    
                    
                //소문자    
                }else{
                    int temp = arr[i]+n;
                    if(temp>122){
                        temp = temp-122+96;
                        answer += (char)temp;
                    }else{
                        answer += (char)(arr[i]+n);    
                    }
                }
                
            }
            
        }
        
        
        //System.out.println(Arrays.toString(arr));
        return answer;
    }
}
