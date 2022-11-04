import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        List<Integer> resultList = new ArrayList<Integer>();
        resultList.add(0);
        
        for(int move : moves){
            move -=1;
            
            for(int i=0;i<board[move].length;i++){    
                
                if(board[i][move]!=0 && board[i][move]!=resultList.get(resultList.size()-1)){
                    
                    resultList.add(board[i][move]);
                    board[i][move]=0;
                    i=board[move].length;
                    
                }else if(board[i][move]!=0&& board[i][move]==resultList.get(resultList.size()-1)){
                    
                    board[i][move]=0;
                    resultList.remove(resultList.size()-1);
                    answer = answer+2;
                    i=board[move].length;
                }
                
            }
            
            
        }
        System.out.println(answer);
        return answer;
    }
}