import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        int whileCount = 0;
        int helloCount=0;
        HashSet<String> hashSet = new HashSet<>();
        while(whileCount<=count){
            String str = scan.nextLine();
            if(str.equals("ENTER")){
                helloCount += hashSet.size();
                hashSet = new HashSet<>();
            }else{
                hashSet.add(str);
            }
            whileCount++;
        }
        helloCount += hashSet.size()-1;
        System.out.println(helloCount);
    }
}
