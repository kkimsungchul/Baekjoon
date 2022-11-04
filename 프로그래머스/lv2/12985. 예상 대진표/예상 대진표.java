class Solution{
    
    public int solution(int n, int a, int b){
        //n 참가자수
        //a , b 만나고 싶은 대전자
        int answer = 1;

            
        while(true){

            System.out.println(a + "  " + b);
            if(a%2!=0){
                a=a/2+1;
            }else{
                a=a/2;
            }

            if(b%2!=0){
                b=b/2+1;
            }else{
                b=b/2;
            }
            
            if(a==b){
                break;
            }else{
                answer++;    
            }
            
                
            
            
            
        }
        return answer;
    }
}