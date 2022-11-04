import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[]args){
        try{

            BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
            int loopCount = Integer.parseInt(buffer.readLine());
            int resultCount=loopCount;
            for(int i=0;i<loopCount;i++){
                String line = buffer.readLine();
                String []arr = line.split("");
                String tempWord=arr[0];
                HashSet<String> set = new HashSet<>();
                set.add(arr[0]);

                for(int j=1;j<arr.length;j++){
                    if(tempWord.equals(arr[j])){

                    }else{
                        if(set.contains(arr[j])){
                            resultCount--;
                            break;
                        }else{
                            set.add(arr[j]);
                            tempWord=arr[j];
                        }
                    }
                }
            }
            System.out.println(resultCount);
            buffer.close();
        }catch(Exception e){

        }
        
        
    }
    
}