import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[]args){
        try{
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String temp="";
        int max=Integer.MIN_VALUE;
        int count =1;
        int resultCount=1;
        while(null !=(temp=buffer.readLine())){
            int a = Integer.parseInt(temp);
            if(a>max){
                max=a;
                resultCount=count;
            }
            count++;
        }
        buffer.close();
        System.out.println(max);
        System.out.println(resultCount);
        }catch(Exception e){
            
        }
    }
    
}