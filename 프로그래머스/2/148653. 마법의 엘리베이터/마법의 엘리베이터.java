class Solution {
    public int solution(int storey) {
        int answer = 0;
        int a = storey%10;
        int b = storey/10;
        //a>5 크면 더하는게 맞음
        //a>=5 다음자릿수가 5보다 클경우엔 더하는게 맞음
        //a>=5 다음자릿수가 4이하일 경우에는 빼는게 맞음
        while(true){
            if(a==5){
                if(b%10>=5){
                    answer += 10-a;
                    b +=1;
                }else{
                    answer +=a;
                }
            }else if (a>5){
                answer += 10-a;
                b +=1;
            }else{
                answer += a;
            }
            a = b%10;
            b = b/10;
            //System.out.println("a : " + a  + " b : " + b + " answer : " + answer);
            if(a==0 && b==0){
                break;
            }
        }
        return answer;
    }
}