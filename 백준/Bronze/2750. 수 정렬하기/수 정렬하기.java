import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int whileCount = sc.nextInt();
        int []arr = new int[whileCount];
        for(int i=0;i<whileCount;i++){
            arr[i] = sc.nextInt();
        }
        int temp=0;
        for(int i=0;i<arr.length-1;i++){
            
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
            
        
    }
    
}