import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        
        //divisor 으로 나눠지는 값들을 list에 저장
        for(int i=0;i<arr.length;i++){
            if(arr[i]%divisor==0){
                arrayList.add(arr[i]);
            }
        }
        
        //list의 크기가 0일경우 나눠지는 값이 없으므로 -1 리턴
        if(arrayList.size()==0){
            int[] answer = {-1};
            return answer;
        //리스트만큼 배열을 생성하여 해당값을 넣고 정렬하여 리턴
        }else{
            int[] answer = new int[arrayList.size()];
            for(int i=0;i<arrayList.size();i++){
                answer[i]=arrayList.get(i);
            }
            Arrays.sort(answer);
            return answer;
        }
        
        
        
        
        
    }
}