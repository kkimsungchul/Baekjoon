import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a[] = new int[28];
        int count=0;
        int max =Integer.MIN_VALUE;
        char result=0;
        String temp = sc.next();
        temp = temp.toLowerCase();
        for(int i=97;i<=122;i++){
            int t= getCharCount(temp,(char)i);
            a[count]=t;
            count++;
            if(t>max){
                max = t;
                result = (char)i;
            }
        }
        Arrays.sort(a);
        if(a[a.length-1]==a[a.length-2]){
            System.out.println("?");
        }else{
            System.out.println((result+"").toUpperCase());
        }

    }

    public static int getCharCount(String str , char c){

        return (int)str.chars().filter(s-> s==c).count();
    }
}