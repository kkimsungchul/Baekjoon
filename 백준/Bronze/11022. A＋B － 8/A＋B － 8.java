import java.util.*;

public class Main{
    public static void main(String[]args){
        //Case #1: 1 + 1 = 2
        Scanner sc  = new Scanner(System.in);
        int count = sc.nextInt();
        for(int i=1;i<=count;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum = a+b;
            System.out.println("Case #"+i+": "+a+" + "+b+" = "+sum);
        }
        
    }
    
}