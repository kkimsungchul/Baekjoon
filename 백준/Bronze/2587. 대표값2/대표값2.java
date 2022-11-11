import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[]args){
        try{
            BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
            int []arr = new int[5];
            int temp=0;
            int sum=0;
            for(int i=0;i<5;i++){
                arr[i] = Integer.parseInt(buffer.readLine());
                sum +=arr[i];
            }
            
            for(int i=0;i<arr.length-1;i++){
                for(int j=i+1;j<arr.length;j++){
                    
                    if(arr[i]>arr[j]){
                        temp = arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }
            }
            System.out.println(sum/5);
            System.out.println(arr[2]);
            buffer.close();
        }catch (Exception e){
            
        }finally{
            
        }
        
        
        
    }
    
}