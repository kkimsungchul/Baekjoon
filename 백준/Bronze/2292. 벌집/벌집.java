import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int room=1;
        int sum=6;
        int count=1;
        while(true){
            if(a<=room){
                break;
            }else{
                room+=sum;
                sum+=6;
                count++;
            }
        }
        System.out.println(count);
    }
}