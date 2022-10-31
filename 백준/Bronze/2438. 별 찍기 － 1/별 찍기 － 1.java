import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        String star = "*";
        for(int i=0;i<count;i++){
            System.out.println(star);
            star+="*";
        }
        
    }
    
}