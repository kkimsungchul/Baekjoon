class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        int area = brown + yellow;   //넓이
        int round = brown+4;        //둘레
        
        
        int xSumY = round/2;        //가로+세로 = 둘레/2
        int x=xSumY/2;              //x초기값 세팅   
        int y=xSumY/2;              //y초기값 세팅
        if(xSumY%2!=0){             //둘레가 홀수일 경우 x+1, 문제조건에 가로가 세로와 같거나 더 길다고했음
            x+=1;
        }
        
        
        while(true){
            
            if(x*y==area){          //x*y가 넓이가 나왔을때 멈춤
                answer[0]=x;
                answer[1]=y;
                break;
            }else{                  //x*y가 넓이가 아닐경우 x는1을 더하고, y는1을뺌, 두 수의 합계는 xSumY 을 넘을수 없음
                x++;
                y--;    
            }
            
            
        }
            
        
        
        //곱했을때 area 가 나오고, 더했을때 xSumY 가 나와야함
        
        
        
        
        //14 ,12
        //9 , 9
        //16 , 16
        //20, 25
        
        
        
        return answer;
    }
}