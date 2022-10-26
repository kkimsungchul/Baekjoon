import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        String b = scanner.nextLine();
        String []splitString = b.split("");

        for(int i=splitString.length-1;i>=0;i--){
            System.out.println(Integer.parseInt(splitString[i])*a);
        }
        System.out.println(a*Integer.parseInt(b));
    }
}