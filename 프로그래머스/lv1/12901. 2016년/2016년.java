class Solution {
    public String solution(int a, int b) {
        String answer = "";
        
        //요일 세팅, 1월1일이 금요일이래서 금요일 부터 시작
        String day[] ={"FRI","SAT","SUN","MON","TUE","WED","THU"};
        //월 세팅, 윤년이므로 2월은29일까지해서 세팅
        int month[]={31,29,31,30,31,30,31,31,30,31,30,31};
        
        int temp=0;
        //1월1일부터 입력한 날까지 지난 날을 계산
        for(int i=0;i<a-1;i++){
            temp+=month[i];
        }
        temp += b;
        
        
        //%7로 나머지를 구하기때문에 한칸씩 땡껴줌
        //배열은 1부터 시작이 아닌 0부터 이므로 0일경우 제일 끝으로, 그외의 경우 -1을 넣어줌
        if(temp%7==0){
            temp=6;
        }else{
            temp = temp%7-1;
        }
        //System.out.println(temp);
        //System.out.println(day[temp%7]);
        return day[temp];
    }
}