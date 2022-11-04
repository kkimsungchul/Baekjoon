import java.util.*;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        int aCount=0;
        int bCount=B.length-1;
        
        while(aCount<A.length){
            answer+= A[aCount]*B[bCount];
            
            aCount++;
            bCount--;
            
            
        }
        
        
        
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        //System.out.println("Hello Java");
        
        return answer;
    }
}