import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        String []temp = sc.next().split("");
        int sum = 0;
        for(int i=0;i<temp.length;i++){
            sum += Integer.parseInt(temp[i]);
        }
        
        System.out.println(sum);
        
    }
}