import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int count=0;
        ArrayList<Integer> result = new ArrayList<Integer>();
        Queue<Integer> progressesQueue = new LinkedList<Integer>();
        Queue<Integer> speedsQueue = new LinkedList<Integer>();
        for(int i=0;i<progresses.length;i++){
            progressesQueue.add(progresses[i]);
            speedsQueue.add(speeds[i]);
        }
        
        while(true){
            
            if(progressesQueue.peek()>=100){
                int size=progressesQueue.size();
                for(int i=0;i<size;i++){
                    if(progressesQueue.peek()>=100){
                        progressesQueue.poll();
                        speedsQueue.poll();
                        count++;
                    }else{
                        break;
                    }
                }
                result.add(count);
                count=0;
                
            }
            
            for(int i=0;i<progressesQueue.size();i++){
                int temp = progressesQueue.poll();
                int sum = speedsQueue.poll();
                temp +=sum;
                progressesQueue.add(temp);
                speedsQueue.add(sum);
            }
            
            if(progressesQueue.size()==0){
                break;
            }
        }
        
        	
        int answer[] = new int[result.size()];
        for(int i=0;i<result.size();i++){
            answer[i] = result.get(i);
        }


        return answer;
    }
}