import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        String width="";
        
        for(int i=0;i<a;i++){
            width+="*";
        }
        
        for(int i=0;i<b;i++){
            System.out.println(width);
        }
        
        //System.out.println(a + b);
    }
}