import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[]args){
        try{
            BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
            String line="";
            while(null!=(line = buffer.readLine())){
                String splitString[] = line.split(" ");
                int sum = Integer.parseInt(splitString[0]) + Integer.parseInt(splitString[1]);
                System.out.println(sum);
            }
            buffer.close();
        }catch(Exception e){
            
        }
        
    }
    
}