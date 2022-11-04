class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int leftHand = 13;
        int rightHand = 13;
        int centerNumber=0;
        for(int a : numbers){
                int temp=0;
            if(a==0){
                temp=11;
            } else{
                temp = a;
            }
            
            if(temp%3==1){
                answer+="L";
                leftHand=a/3+10;

            }else if(temp%3==0){
                answer+="R";
                rightHand=(a-1)/3+10;
            }else{
                if(a==0){
                    centerNumber = (a+10)/3+20;
                }else{
                    centerNumber = a/3+20;
                }
                System.out.println("## centerNumber : "  + centerNumber);
                int tempLeft = centerNumber%10-leftHand%10 ;
                int tempRight = centerNumber%10-rightHand%10;

                
                if (tempLeft < 0) {
                    tempLeft *= -1;
                }
                
                if (tempRight < 0) {
                    tempRight *= -1;
                } 
                tempLeft  += centerNumber/10 - leftHand/10; 
                tempRight += centerNumber/10 - rightHand/10;  
                

                if(tempLeft<tempRight){
                    answer+="L";
                    leftHand=centerNumber;
                }else if(tempLeft>tempRight){
                    answer+="R";
                    rightHand=centerNumber;
                }else{
                    if(hand.equals("right")){
                        answer+="R";
                        rightHand=centerNumber;
                    }else{
                        answer+="L";
                        leftHand=centerNumber;
                    }
                    
                }
            }
                System.out.println("a : " + a);
                System.out.println("leftHand : " + leftHand);
                System.out.println("rightHand : " + rightHand);
                System.out.println("================================");
        }
        
        return answer;
        
        
    }
}