import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[]args){
        try{
            BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
            int whileCount = Integer.parseInt(buffer.readLine());
            for(int i=0;i<whileCount;i++){
                double average=0;
                double sum=0;
                String temp[] = buffer.readLine().split(" ");
                double student[] = new double[temp.length-1];
                double count=0;
                for(int j=1;j<=Integer.parseInt(temp[0]);j++){
                    sum += Integer.parseInt(temp[j]);
                    student[j-1]=Integer.parseInt(temp[j]);
                }
                average = sum/student.length;
                Arrays.sort(student);

                for(int j=0;j<student.length;j++){
                    if(student[j]>average){
                        count++;
                    }
                }
                double result = count/(double)student.length*100;
                System.out.println(String.format("%.3f",result)+"%");
            }


        }catch(Exception e){

        }
    }
    
}