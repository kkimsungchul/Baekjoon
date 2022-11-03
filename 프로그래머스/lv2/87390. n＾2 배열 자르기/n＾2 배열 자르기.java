import java.util.*;

class Solution {
    public int[] solution(int n, long left, long right) {
        //리턴할 배열의 크기는 left부터 right까지이며, left를 포함하기때문에 1을 더함
        int[] answer = new int[(int)right-(int)left+1];
        int index=0;
        long temp=0;
        left = left+1;
        right = right+1;
        
        for(long i=left;i<=right;i++){
            if(i%n==0){             //i를n으로 나눴을때 나머지가 0이라면
                temp=n;             //temp 는 0
            }else{                  //나머지가 있다면
                temp=i%n;           //temp에는 나머지를 넣음
                if(temp<=i/n){      //다만나머지가 i/n으로 나눈 몫보다 작거나 같다면
                    temp = i/n+1;   //temp는 몫+1로 변경
                }
            }
            answer[index]=(int)temp;
            index++;
        }
        
        
        return answer;
    }
}