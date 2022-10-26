import java.util.*;

public class Main{
    public static void main(String[]args){
        //16개의 피스를 사용하며, 킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개로 구성되어 있다.
        Scanner scanner = new Scanner(System.in);
        int a = 1-scanner.nextInt();
        int b = 1-scanner.nextInt();
        int c = 2-scanner.nextInt();
        int d = 2-scanner.nextInt();
        int e = 2-scanner.nextInt();
        int f = 8-scanner.nextInt();
        System.out.println(a +" " + b+" " + c+" " + d+" " + e+" " + f);
    }
}