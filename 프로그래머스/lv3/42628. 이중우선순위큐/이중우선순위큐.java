import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int i=0;i<operations.length;i++){
            if(operations[i].substring(0,1).equals("I")){
                //System.out.println(operations[i]);
                list.add(Integer.parseInt(operations[i].substring(2)));
                Collections.sort(list);
            }else if(operations[i].equals("D 1")){
                if(list.size()>0){
                    list.remove(list.size()-1);
                }
                //System.out.println(operations[i]);
            }else if(operations[i].equals("D -1")){
                if(list.size()>0){
                    list.remove(0);
                }                
                //System.out.println(operations[i]);
            }
        }
        
        if(list.size()==0){
            answer[0]=0;
            answer[1]=0;
        }else{
            answer[0]=list.get(list.size()-1);
            answer[1]=list.get(0);
            
        }
        //System.out.println(list);
        
        return answer;
    }
}