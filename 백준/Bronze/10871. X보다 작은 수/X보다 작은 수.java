import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[]args){
        try{
            BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
            String [] temp1 = buffer.readLine().split(" ");
            String [] temp2 = buffer.readLine().split(" ");
            int target = Integer.parseInt(temp1[1]);
            String result ="";
            for(int i=0;i<temp2.length;i++){
                if(Integer.parseInt(temp2[i])<target){
                    
                    if(result.equals("")){
                        result +=temp2[i];
                    }else{
                        result += " "+temp2[i];    
                    }
                    
                }
            }
            buffer.close();
            System.out.println(result);
        }catch(Exception e){
        }
    }
}