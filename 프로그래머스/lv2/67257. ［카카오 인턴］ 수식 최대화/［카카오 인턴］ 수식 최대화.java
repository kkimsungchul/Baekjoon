import java.util.*;

class Solution {
    long answer = 0;
    long max=0;
    
    public long solution(String expression) {
        
        String[] strArr1 = expression.split("\\+|\\-|\\*|\\/");
        String[] strArr2 = expression.replaceAll("[0-9]","").split("");
        
        for(int i=1;i<=6;i++){
            calculator(strArr1,strArr2,i);    
        }
        

        
        return max;
    }
    
    public void calculator(String[] strArr1, String[] strArr2, int select){
        ArrayList<Long> number = new ArrayList<Long>();
        ArrayList<String> sign = new ArrayList<String>();
        for(int i=0;i<strArr1.length;i++){
            number.add(Long.parseLong(strArr1[i]));
        }
        for(int i=0;i<strArr2.length;i++){
            sign.add(strArr2[i]);
        }
        selectCase(number,sign,select);
        if(number.get(0)<0){
            if(max<number.get(0)*-1){
                max=number.get(0)*-1;
            }
        }else{
            if(max<number.get(0)){
                max=number.get(0);
            }
        }
        
        
    }
    
    //더하기
    public void add(ArrayList<Long> number , ArrayList<String> sign){
        for(int i=0; i<sign.size(); i++){
            if(sign.get(i).equals("+")){
                number.set(i,number.get(i)+number.get(i+1));
                number.remove(i+1);
                sign.remove(i);
                add(number,sign);
            }
        }
    }
    
    //빼기
    public void subtract(ArrayList<Long> number , List<String> sign){
        for(int i=0; i<sign.size(); i++){
            if(sign.get(i).equals("-")){
                number.set(i,number.get(i)-number.get(i+1));
                number.remove(i+1);
                sign.remove(i);
                subtract(number,sign);
            }
        }    
    }
    
    //곱하기
    public void multiply(ArrayList<Long> number , List<String> sign){
        for(int i=0; i<sign.size(); i++){
            if(sign.get(i).equals("*")){
                number.set(i,number.get(i)*number.get(i+1));
                number.remove(i+1);
                sign.remove(i);
                multiply(number,sign);
            }
        }    
    }
    
   
    public void selectCase(ArrayList<Long> number , ArrayList<String> sign,int select){
        switch(select) {
			case 1:
                add(number,sign);//더하기
                subtract(number,sign);//빼기
                multiply(number,sign);//곱하기
				break;
            case 2:
                add(number,sign);//더하기
                multiply(number,sign);//곱하기
                subtract(number,sign);//빼기
				break;
                
            case 3:
                subtract(number,sign);//빼기
                add(number,sign);//더하기
                multiply(number,sign);//곱하기
				break;
            case 4:
                subtract(number,sign);//빼기
                multiply(number,sign);//곱하기
                add(number,sign);//더하기
				break;                
            case 5:
                multiply(number,sign);//곱하기
                subtract(number,sign);//빼기
                add(number,sign);//더하기
				break;
            case 6:
                multiply(number,sign);//곱하기
                add(number,sign);//더하기
                subtract(number,sign);//빼기
				break;
              
		}
    }
    
}