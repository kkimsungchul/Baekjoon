class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        long big=0;
        long small=0;
        //같을경우
        if(a==b){
            answer = a;
        //다를경우    
        }else{
            
            //시작값을 정하기위한 IF
            if(a>b){
                big=a;
                small=b;
            }else{
                big=b;
                small=a;
            }
            
            //반복문을돌면서 더해줌
            for(long i=small;i<=big;i++){
                answer+=i;
            }
            
        }
        
        
        return answer;
    }
}