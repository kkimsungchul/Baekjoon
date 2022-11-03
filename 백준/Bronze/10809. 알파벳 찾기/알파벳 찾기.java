import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        //97 a , 122 z
        String result="";
        for(int i=97;i<=122;i++){
            if(i!=122){
                result +=str.indexOf(i)+" ";
            }else{
                result +=str.indexOf(i);
            }
        }
        System.out.println(result);
        
        
    }
}