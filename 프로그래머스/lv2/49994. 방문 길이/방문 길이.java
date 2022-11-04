import java.util.*;

class Solution {
    public int solution(String dirs) {
        //좌표를 담을 Hashset
        HashSet<String> hashSet = new HashSet<String>();
        
        int x=0;        //현재위치 x
        int y=0;        //현재위치 y
        int moveX=0;    //이동후 위치 x
        int moveY=0;    //이동후 위치 y
        //HashMap<String,String> map = new HashMap<String,String>();
        
        for(int i=0;i<dirs.length();i++){
            if(dirs.charAt(i)=='U'){
                if(y==5){
                    continue;
                }else{
                    moveY = y+1;
                }                
            }else if(dirs.charAt(i)=='D'){
                if(y==-5){
                    continue;
                }else{
                    moveY = y-1;
                }                
            }else if(dirs.charAt(i)=='R'){
                if(x==5){
                    continue;
                }else{
                    moveX = x+1;
                }                
            }else if(dirs.charAt(i)=='L'){
                if(x==-5){
                    continue;
                }else{
                    moveX = x-1;
                }
            }
            //현재위치와 이동한위치를 문자열로 생성하여 hashSet에 저장
            //x,y와 moveX ,moveY를 바꿔서 저장한이유는
            //0,0->0,1로 간것과 0,1->0,0 로 간건 같은길로 봐야함
            String moveString1 = x + "" + y + " " +moveX + "" + moveY;
            String moveString2 = moveX + "" + moveY + " " + x + "" + y;
            
            hashSet.add(moveString1);
            hashSet.add(moveString2);
            
            //x와y를 이동 후 위치로 변경함
            x = moveX;
            y = moveY;
            
        }
        
        return hashSet.size()/2;
    }
}
