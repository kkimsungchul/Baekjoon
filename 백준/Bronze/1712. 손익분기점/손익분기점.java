import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long count=0;
        if(b>=c){
            System.out.println(-1);
        }else{
            if(a==0){
                count=1;
            }else{
                long temp = c-b;
                count=a/temp+1;
            }
            System.out.println(count);    
            
        }
    }
    
}