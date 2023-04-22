import java.util.*;

class Solution {
    public int solution(String begin, String target, String[] words) {
        int answer = dfs(begin, target, words, new boolean[words.length], 0, Integer.MAX_VALUE);
        return answer == Integer.MAX_VALUE ? 0 : answer;
    }
    
    private int dfs(String current, String target, String[] words, boolean[] visited, int count, int minCount) {
        if (current.equals(target)) {
            return Math.min(count, minCount);
        }
        
        for (int i = 0; i < words.length; i++) {
            if (!visited[i] && isConvertible(current, words[i])) {
                visited[i] = true;
                minCount = dfs(words[i], target, words, visited, count + 1, minCount);
                visited[i] = false;
            }
        }
        
        return minCount;
    }
    
    private boolean isConvertible(String str1, String str2) {
        int count = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                count++;
            }
        }
        return count == 1;
    }
}
