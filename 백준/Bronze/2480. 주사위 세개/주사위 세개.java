import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int i=10000;
        int j=1000;
        
        if(a==b){
            if(a==c){
                System.out.println(i+a*1000);
            }else{
                System.out.println(j+a*100);
            }
            
        }else if (b==c){
            if(a==c){
                System.out.println(i+a*1000);
            }else{
                System.out.println(j+b*100);
            }
            
        }else if (a==c){
            if(a==b){
                System.out.println(i+a*1000);
            }else{
                System.out.println(j+a*100);
            }
        }else{
            if(a>b){
                if(a>c){
                    System.out.println(a*100);
                }else{
                    System.out.println(c*100);
                }
            }else{
                if(b>c){
                    System.out.println(b*100);
                }else{
                    System.out.println(c*100);
                }
                
            }
        }
        
        
    }
    
}