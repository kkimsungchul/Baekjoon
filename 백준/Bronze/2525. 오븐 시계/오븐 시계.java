import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        int sum = sc.nextInt();
        
        int addHour = sum/60;
        int addMinute = sum%60;
        
        hour +=addHour;
        minute +=addMinute;
        if(minute>=60){
            minute-=60;
            hour++;
        }
        
        if(hour>=24){
            hour-=24;
        }
        
        System.out.println(hour +" " + minute);

        
        
    }
}