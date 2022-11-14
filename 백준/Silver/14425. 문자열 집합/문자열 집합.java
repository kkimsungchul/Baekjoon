import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[]args){
        try{
            BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
            String temp[] = buffer.readLine().split(" ");
            int loopCount1 = Integer.parseInt(temp[0]);
            int loopCount2 = Integer.parseInt(temp[1]);
            int resultCount=0;
            HashSet<String> set = new HashSet<>();
            
            for(int i=0;i<loopCount1;i++){
                set.add(buffer.readLine());
            }
            
            for(int i=0;i<loopCount2;i++){
                if(set.contains(buffer.readLine())){
                    resultCount++;
                }
            }
            System.out.println(resultCount);

        
            
            buffer.close();
        }catch(Exception e){
            
            
        }
        
        
        
    }
    
}