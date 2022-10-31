import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[]args){
        try{
            BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));    
            int count = Integer.parseInt(buffer.readLine());
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
                
            String [] splitString = buffer.readLine().split(" ");
            for(int i=0;i<splitString.length;i++){
                int temp = Integer.parseInt(splitString[i]);
                
                if(temp>max){
                    max = temp;
                }
                if(temp<min){
                    min = temp;
                }
                
            }
            buffer.close();
            System.out.println(min + " " + max);
        }catch(Exception e){
            
        }
        
        
        
    }
    
}