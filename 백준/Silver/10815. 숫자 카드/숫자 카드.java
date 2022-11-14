import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[]args){
        try{
            BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferWriter = new BufferedWriter(new OutputStreamWriter(System.out));
            int loopCount1 = Integer.parseInt(buffer.readLine());
            String temp1[] = buffer.readLine().split(" ");
            HashSet<String> set = new HashSet<>();
            ArrayList<String> list = new ArrayList<>();
            for(int i=0;i<temp1.length;i++){
                set.add(temp1[i]);
            }

            int loopCount2 = Integer.parseInt(buffer.readLine());
            String temp2[] =  buffer.readLine().split(" ");
            for(int i=0;i<loopCount2;i++){
                if(set.contains(temp2[i])){
                    bufferWriter.write("1");
                }else{
                    bufferWriter.write("0");
                }
                if(i!=loopCount2-1){
                    bufferWriter.write(" ");
                }
            }
            bufferWriter.flush();
            bufferWriter.close();

            buffer.close();
        }catch(Exception e){


        }
        
        
        
    }
    
}