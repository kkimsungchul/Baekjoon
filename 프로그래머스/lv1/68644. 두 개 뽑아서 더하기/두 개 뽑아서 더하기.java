import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        
        
        HashSet<Integer> hashSet = new HashSet<Integer>();
        
        //이중포문으로 더할수 있는 값들을 HashSet에 저장 (중복방지)
        for(int i=0;i<numbers.length-1;i++){   
            for(int j=i+1;j<numbers.length;j++){
                hashSet.add(numbers[i]+numbers[j]);
            }
        }
        
        
        //HashSet 크기만큼 배열 선언
        int[] answer = new int[hashSet.size()];
        //배열순서
        int count =0;
		
        //HashSet의 크기만큼 반복문 시작
        Iterator iterator = hashSet.iterator();
		while(iterator.hasNext()) {
			answer[count] = Integer.parseInt(iterator.next().toString());
            count++;
            //System.out.print(iterator.next().toString() + " ");
		}
        //배열에 저장후 정렬
        Arrays.sort(answer);
        return answer;
    }
}