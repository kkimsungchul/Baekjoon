import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[]args){
        try{
            BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
            int arr[] = new int[28];
            boolean []checkArr = new boolean[30];
            for(int i=0;i<arr.length;i++){
                arr[i]= Integer.parseInt(buffer.readLine());
            }
            for(int i=0;i<arr.length;i++){
                checkArr[arr[i]-1]=true;
            }

            for(int i=0;i<checkArr.length;i++){
                if(checkArr[i]==false){
                    System.out.println(i+1);
                }
            }
            buffer.close();
        }catch(Exception e){

        }
        
    }
    
}