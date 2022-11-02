import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[]args){
        try{
            BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
            int arr[] = new int[10];
            HashSet<Integer> set = new HashSet<>();
            for(int i=0;i<arr.length;i++){
                arr[i] = Integer.parseInt(buffer.readLine());
                set.add(arr[i]%42);
            }
            System.out.println(set.size());
            
        }catch(Exception e){
            
        }
        
    }
}