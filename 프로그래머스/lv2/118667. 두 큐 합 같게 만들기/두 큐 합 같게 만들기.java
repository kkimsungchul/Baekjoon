import java.util.*;

class Solution {
    public int solution(int[] queue1, int[] queue2) {
        Queue<Long> que1 = new LinkedList<Long>();
        Queue<Long> que2 = new LinkedList<Long>();
        int answer = 0;
        long sum = 0;
        long queueSum1=0;
        long queueSum2=0;
        int count =0;
        int maxCount = queue1.length*3;
        
        for(int i=0;i<queue1.length;i++){
            queueSum1+=queue1[i];
            queueSum2+=queue2[i];
            que1.add((long)queue1[i]);
            que2.add((long)queue2[i]);
        }
        if((queueSum1+queueSum2)%2==1){
            return -1;
        }
        

        while(count<maxCount){
            
            if(queueSum1>queueSum2){
                long temp=que1.poll();
                que2.add(temp);
                queueSum1 -=temp;
                queueSum2 +=temp;
            }else if(queueSum2>queueSum1){
                long temp=que2.poll();
                que1.add(temp);
                queueSum2 -=temp;
                queueSum1 +=temp;
            }else if(queueSum1==queueSum2){
                break;
            }
            count++;
            // System.out.println(que1);
            // System.out.println(que2);
            // System.out.println();
        }
        
        if(count>=maxCount){
            answer=-1;
        }else{
            answer = count;
        }
        // System.out.println(queueSum1);
        // System.out.println(queueSum2);
        // System.out.println(que1);
        // System.out.println(que2);
        
        
        return answer;
    }
}