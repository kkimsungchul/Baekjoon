import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int starCount = sc.nextInt();
        int spaceCount=starCount-1;
        String star="*";
        for(int i=0;i<starCount;i++){
            for(int j=0;j<spaceCount;j++){
                System.out.print(" ");
            }
            System.out.println(star);
            star+="*";
            spaceCount--;
        }      
    }
}