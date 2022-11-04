import java.util.*;

class Solution {
    public int solution(String numbers) {
        int answer = 0;
        String tempNumbers[] = numbers.split("");
		List<String> arr = Arrays.asList(tempNumbers);
		ArrayList<String> returnArr = new ArrayList<>();
        
        //소수배열
        boolean [] decimal = getDecimal(numbers);
        
		//입력된 숫자로 만든 모든 수
		returnArr = result(arr,returnArr,"");
        
        //숫자로 변환
        //changeStringToInt(returnArr);
        HashSet<Integer> intHashSet = changeStringToInt(returnArr);
     
        
        Iterator iter = intHashSet.iterator();
        while(iter.hasNext()) {
            int a = (int)iter.next();
            if(!decimal[a]){
                answer++;
            }
        }

        
        
        return answer;
    }
    
    
    public boolean[] getDecimal(String numbers){
        //만들수 있는 제일 큰 숫자까지 배열을 선언
        String tempb[] = numbers.split("");
        Arrays.sort(tempb);
        String tempMax="";
        for(int i=tempb.length-1;i>=0;i--){
            tempMax +=tempb[i];
        }
        int max = Integer.parseInt(tempMax);
        boolean prime[] = new boolean[max+1];
        // 구하고자 하는 숫자 범위
        int N = max;
        // 소수는 false
        // 1은 소수가 아니므로 제외
        prime[0] = prime[1] = true;
        for(int i=2; i*i<=N; i++){
            // prime[i]가 소수라면
            if(!prime[i]){
                // prime[j] 소수가 아닌 표시
                for(int j=i*i; j<=N; j+=i) {
                    prime[j] = true;                
                }
            }        
        }        
        
        return prime;
        
    }
    
    //입력된 숫자로 만들수 있는 모든 숫자를 구함
	public ArrayList<String> result(List<String> arr, ArrayList<String> returnArr, String temp){
        String loopTemp=temp;
        for(int i=0;i<arr.size();i++) {
            loopTemp += arr.get(i);
            
            returnArr.add(loopTemp);
            
            if(arr.size()!=1){
                ArrayList<String> tempArr = new ArrayList<>(arr);
                tempArr.remove(i);
                result(tempArr,returnArr,loopTemp);
            }
            loopTemp = temp;
        }

        return returnArr;
    }  
    
    public HashSet<Integer> changeStringToInt(ArrayList<String> stringList){
        HashSet<Integer> intHashSet = new HashSet<Integer>();
        for(int i=0;i<stringList.size();i++){
            intHashSet.add( Integer.parseInt(stringList.get(i)));
        }
        return intHashSet;
    }
}