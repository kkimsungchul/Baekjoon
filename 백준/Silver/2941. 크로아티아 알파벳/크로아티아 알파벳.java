import java.util.*;

public class Main{
    
    private static String temp=null;
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        temp = sc.nextLine();
        String arr[] = {"c=","c-","dz1","d-","l1","n1","s=","z="};
        temp = temp.replaceAll("dz=","dz1");
        temp = temp.replaceAll("nj","n1");
        temp = temp.replaceAll("lj","l1");
        int count=0;

        for(int i=0;i<arr.length;i++){
            count+=replaceCount(arr[i]);
        }
        count+=temp.length();
        System.out.println(count);
    }
    public static int replaceCount(String reStr){
        int defaultLength = temp.length();
        temp = temp.replaceAll(reStr,"");
        int replaceLength = temp.length();
        int minus = defaultLength-replaceLength;
        return minus/reStr.length();

    }
}