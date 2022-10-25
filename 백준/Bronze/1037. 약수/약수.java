import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        int whileCount = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        while(whileCount<count){
            int temp = scan.nextInt();
            
            if(temp>max){
                max = temp;
            }
            if(temp<min){
                min = temp;
            }
            whileCount++;
        }
        
        System.out.println(min*max);
    }
}
