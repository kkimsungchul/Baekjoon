import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[]args){
        try{
            BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
            int count = Integer.parseInt(buffer.readLine());
            String temp[] = buffer.readLine().split(" ");
            double scoreArr[] = new double[count];
            double max = Integer.MIN_VALUE;
            double sum=0;
            for(int i=0;i<temp.length;i++){
                scoreArr[i] = Integer.parseInt(temp[i]);
                if(scoreArr[i]>max){
                    max=scoreArr[i];
                }
            }
            for(int i=0;i<scoreArr.length;i++){
                sum+= (scoreArr[i]/max)*100;
            }
            System.out.println(sum/count);
        }catch(Exception e){

        }
        
    }
}