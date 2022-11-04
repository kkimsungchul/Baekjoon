import java.util.*;

class Solution {
    public String[] solution(String[] record) {

        int count=0;
        //ArrayList<String> idList = new ArrayList<String>();
        HashMap<String,String> nameMap = new HashMap<String,String>();
        for(int i=0;i<record.length;i++){
            String [] splitString = record[i].split(" ");
            if(!splitString[0].equals("Leave")){
                nameMap.put(splitString[1],splitString[2]);    
                
            }
            if(!splitString[0].equals("Change")){
                count++;
            }
        }
        
        String answer[] = new String[count];
        int count2=0;
        for(int i=0;i<record.length;i++){
            String [] splitString = record[i].split(" ");
            //
            
            if(splitString[0].equals("Leave")){
                answer[count2]=nameMap.get(splitString[1])+"님이 나갔습니다.";
                count2++;
            }else if(splitString[0].equals("Enter")){
                answer[count2]=nameMap.get(splitString[1])+"님이 들어왔습니다.";
                count2++;
            }
        }
        
        
        return answer;
    }
}