import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 1;
        int max=0;
        ArrayList<Vo> tempList = new ArrayList<>();
        //초기 세팅, 선택한 문서만 true로 지정함
        for(int i=0;i<priorities.length;i++){
            if(i==location){
                Vo vo = new Vo(priorities[i],true);
                tempList.add(vo);
            }else{
                Vo vo = new Vo(priorities[i],false);
                tempList.add(vo);
            }
            if(priorities[i]>max){
                max=priorities[i];
            }
        }
        Queue<Vo> queue = new LinkedList<>(tempList);

        //반복
        while(true){
            Vo tempVo = new Vo();
            
            
            tempVo = queue.peek(); //queue 에서 첫번째 값을 꺼내옴
            if(tempVo.getPrioritie()==max){ //초기 세팅에서 지정한 max 값과 같을 경우 아래의 if문 실행
                if(tempVo.getSelect()){     //선택한 문서인지 확인
                    break;
                }else{                      //선택한 문서가 아닐경우
                    queue.remove();         //문서 삭제
                    answer++;               //출력 카운트 추가
                    
                    Iterator iterator = queue.iterator();   //제일 높은 우선순위를 다시 구함
                    int tempMax=0;
                    while (iterator.hasNext()){
                        int t=((Vo)iterator.next()).getPrioritie();
                        if(t>tempMax){
                            tempMax=t;
                        }
                    }
                    max = tempMax;                    
                }
            
            }else{                          //max값이 일치하지 않을경우
                queue.remove();             //해당값을 앞에서 삭제하고
                queue.add(tempVo);          //다시 뒤에 추가
            }
            
        }
        return answer;
    }
}

class Vo{
    
    int prioritie;
    boolean select;
    
    public Vo(){
        
    }
    public Vo(int prioritie , boolean select){
        this.prioritie = prioritie;
        this.select = select;
    }
    
    public void setPrioritie(int prioritie){
        this.prioritie = prioritie;
    }
    public int getPrioritie(){
        return prioritie;
    }
    public void setSelect(boolean select){
        this.select = select;
    }
    public boolean getSelect(){
        return select;
    }
    public String toString(){
        return "prioritie : " + prioritie + ", select : " + select;
    }
    
    
}