import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[]args){
        try{
            
        
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String temp[] = buffer.readLine().split("");
        int a = Integer.parseInt(temp[2] + temp[1] + temp[0]);
        int b = Integer.parseInt(temp[6] + temp[5] + temp[4]);
        
        if(a>b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
            buffer.close();
        }catch(Exception e){
            
        }
        
    }
    
}