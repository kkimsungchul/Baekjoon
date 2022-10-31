import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int count=0;
        int t= sc.nextInt();
        int target=t;
        while(true){
            count++;
            int a = t/10;
            int b = t%10;
            int sum = a+b;
            t = (b*10)+(sum%10);
            if(target==t){
             break;
            }

        }
        System.out.println(count);        
        
    }
    
}