import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String []str = sc.nextLine().split("");
        sc.close();
        int result=0;
        for(int i=0;i<str.length;i++){
            char temp = str[i].charAt(0);
            int sum = (int)temp-65;
            if((int)temp>=83){
                sum--;
            }
            if((int)temp==90){
                sum--;
            }
            int time = sum/3+3;
            result +=time;
        }
        System.out.println(result);
        //65 90
        
        
    }
    
}