import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(buffer.readLine());

        for (int i = 0; i < count; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(buffer.readLine());
            int a = Integer.parseInt(stringTokenizer.nextToken());
            int b = Integer.parseInt(stringTokenizer.nextToken());
            int result = 1;
            for (int j = 0; j < b; j++) {
                result = result * a % 10;
                if(result==0){
                    result=10;
                }
            }
            System.out.println(result);
        }
    }
}
