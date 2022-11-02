import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[]args){
        try{
            int [][]arr = new int[9][9];
            BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
            int max=Integer.MIN_VALUE;
            int x=0;
            int y=0;
            for(int i=0;i<arr[0].length;i++){
                String temp[] = buffer.readLine().split(" ");
                for(int j=0;j<arr[0].length;j++){
                    arr[i][j] = Integer.parseInt(temp[j]);
                    if(arr[i][j]>max){
                        max=arr[i][j];
                        x=i+1;
                        y=j+1;
                    }
                }
            }
            System.out.println(max);
            System.out.println(x + " " + y);
        }catch (Exception e){

        }
    }
}