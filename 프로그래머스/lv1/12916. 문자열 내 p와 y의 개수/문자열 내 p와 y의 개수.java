class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int yCount=0;
        int pCount=0;
        String spiltString[] = s.split("");
        for(int i=0;i<spiltString.length;i++){
            
            if(spiltString[i].equalsIgnoreCase("y")){
                yCount++;
            }
            if(spiltString[i].equalsIgnoreCase("p")){
                pCount++;
            }
        }
        
        if(yCount==pCount){
            return true;
        }else{
           return false;
        }

    }
}