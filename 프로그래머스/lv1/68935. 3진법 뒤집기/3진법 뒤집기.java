class Solution {
    public int solution(int n) {
        int answer = 0;
        String temp="";
        
        //3진법으로 변환
        while(true){
            if(n/3>=1){
                temp = n%3 + temp;
                n = n/3;
            }else{
                temp = n%3 + temp;
                break;
            }
        }
        System.out.println(temp);
        //변환된 3진법을 역순으로 정렬
        String splitString[] = temp.split("");
        temp="";
        for(int i=splitString.length-1;i>=0;i--){
            temp+=splitString[i];
        }
        System.out.println(temp);
        //정렬된 3진법을 숫자형으로 변환, 다만 int형보다 커질수 있기에 Long 으로 변환하여 계산함
        Long a = Long.parseLong(temp);

        //10진법 변환에 사용할 자릿수        
        int c=1;
        
        //10진법으로 변환
        while(true){
            if(a/10>=1){
                answer += a%10*c;
                a = a/10;
                c *=3;
            }else{
                answer += a%10*c;
                break;
            }
            
        }
        
        
        
        
        return answer;
    }
}