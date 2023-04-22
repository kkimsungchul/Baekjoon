import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> map = new HashMap<>();
        
        // 의상의 종류별로 갯수를 세어서 Map에 저장합니다.
        for (String[] c : clothes) {
            if (!map.containsKey(c[1])) {
                map.put(c[1], 1);
            } else {
                map.put(c[1], map.get(c[1]) + 1);
            }
        }
        
        // 각 의상 종류별로 입을지 입지 않을지 선택하는 경우의 수를 곱하여 결과를 구합니다.
        for (int value : map.values()) {
            answer *= (value + 1);
        }
        
        // 아무것도 입지 않은 경우는 제외하므로 1을 빼고 결과를 반환합니다.
        return answer - 1;
    }
}