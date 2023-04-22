import java.util.*;

class Solution {
    int answer=0;
    int maxAnswer;
    public int solution(String begin, String target, String[] words) {
        
        maxAnswer = words.length;
        if(!firstCheck(target ,words)){
            return answer;
        }
        
        ArrayList<String> wordList = new ArrayList<>(Arrays.asList(words));
        dfs(begin,target,wordList);
        
        return answer;
    }
    public void dfs(String begin , String target , ArrayList<String> wordList){
        //System.out.println(begin);
        if(begin.equals(target)){
            if(answer!=0 && maxAnswer-wordList.size()<answer){
                answer = maxAnswer-wordList.size();
            }else if(answer==0){
                answer = maxAnswer-wordList.size();
            }
        }else{
            for(int i=0;i<wordList.size();i++){
                int count=0;
                for(int j=0;j<begin.length();j++){
                    if(begin.charAt(j)!=wordList.get(i).charAt(j)){
                        count++;
                    }
                    if(count>1){
                        break;
                    }
                }
                if(count==1){
                    String nextWord = wordList.get(i);
                    wordList.remove(i);
                    dfs(nextWord , target , wordList);
                    wordList.add(i,nextWord);
                }
            }            
        }
    }
    public boolean firstCheck(String target , String[] words){
        for(String word : words){
            if(word.equals(target)){
                return true;
            }
        }
        return false;
    }

}