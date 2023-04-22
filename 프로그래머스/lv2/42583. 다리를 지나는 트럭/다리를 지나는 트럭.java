import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int curWeight = 0;
        Queue<Integer> queue = new LinkedList<>();
        
        for(int i=0;i<truck_weights.length;){
            
            if(queue.size() == bridge_length){
                curWeight -= queue.poll();
            }else{
                
                if (curWeight + truck_weights[i] > weight) {
                    queue.add(0);
                    answer++;
                  
                }else{
                    queue.add(truck_weights[i]);
                    curWeight +=truck_weights[i];
                    answer++;
                    i++;
                }

            }
            
        }
        answer+=bridge_length;
        return answer;
    }
}