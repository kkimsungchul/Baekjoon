import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[]args){
        try{
            BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
            String temp1[] = buffer.readLine().split(" ");
            int coount = Integer.parseInt(temp1[0]);
            int cut = Integer.parseInt(temp1[1]);
            String []temp2 = buffer.readLine().split(" ");
            int arr[] = new int[temp2.length];
            int temp=0;
            for(int i=0;i<temp2.length;i++){
                arr[i] = Integer.parseInt(temp2[i]);
            }
            
            
            for(int i=0;i<arr.length-1;i++){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[i]<arr[j]){
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            System.out.println(arr[cut-1]);
            buffer.close();
        }catch(Exception e){
            
        }

        
        
        
        
        
        
    }
}