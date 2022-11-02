import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[]args){
        try{
            BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
            int line = Integer.parseInt(buffer.readLine());
            for(int i=0;i<line;i++){
                int score=0;
                int sum=0;
                String [] splitString = buffer.readLine().split("");
                for(int j=0;j<splitString.length;j++){
                    if(splitString[j].equalsIgnoreCase("O")){
                        score++;
                        sum +=score;
                    }else{
                        score=0;
                    }
                }
                System.out.println(sum);
            }
            
        }catch(Exception e){
            
        }
    }
    
}