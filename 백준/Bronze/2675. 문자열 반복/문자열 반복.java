import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        String result="";
        for(int k=0;k<count;k++){
            int loop = sc.nextInt();
            String word[] = sc.next().split("");

            for(int i=0;i<word.length;i++){
                for(int j=0;j<loop;j++){
                    result +=word[i];
                }
            }
            result+="\n";
        }
        System.out.println(result);
    }
    
}