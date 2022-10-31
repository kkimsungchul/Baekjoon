import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[]args){
        try{
            BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
            int arraySize = Integer.parseInt(buffer.readLine());
            String [] arr = buffer.readLine().split(" ");
            String target = buffer.readLine();
            int count=0;
            for(int i=0;i<arr.length;i++){
                if(target.equals(arr[i])){
                    count++;
                }
            }
            System.out.println(count);
        }catch (Exception e){

        }
        
    }
    
}