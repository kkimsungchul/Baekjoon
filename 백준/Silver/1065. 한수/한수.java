import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count=0;        
        if(a<100){
            count=a;
        }else{
            for(int i=100;i<=a;i++){
                String temp[] = String.valueOf(i).split("");
                if(Integer.parseInt(temp[0])-Integer.parseInt(temp[1]) ==Integer.parseInt(temp[1])-Integer.parseInt(temp[2])){
                    count++;
                }
            }
            count +=99;
        }
        System.out.println(count);
    }

}