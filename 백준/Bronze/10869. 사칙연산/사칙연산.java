import java.util.Scanner;
import java.io.*;

public class Main{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b= scanner.nextInt();
        //첫째 줄에 A+B, 둘째 줄에 A-B, 셋째 줄에 A*B, 넷째 줄에 A/B, 다섯째 줄에 A%B를 출력한다.
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        
    }


}