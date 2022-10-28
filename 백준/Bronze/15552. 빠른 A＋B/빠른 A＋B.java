import java.util.*;
import java.io.*;


public class Main{
    public static void main(String[]args) throws IOException {
        BufferedWriter bufferWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(buffer.readLine());

        for(int i=0;i<count;i++){
            StringTokenizer stringTokenizer = new StringTokenizer(buffer.readLine()," ");
            int sum = Integer.parseInt(stringTokenizer.nextToken()) + Integer.parseInt(stringTokenizer.nextToken());
            bufferWriter.write(sum+"\n");

        }
        buffer.close();
        bufferWriter.flush();
        bufferWriter.close();
    }
    
}