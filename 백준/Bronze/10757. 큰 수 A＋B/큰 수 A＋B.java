import java.util.*;

public class Main{
        public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String tempArr[] = sc.nextLine().split(" ");
        String resultString="";
        int tenCheck=0;
        //계산하기 쉽도록 역순으로 정렬
        for(int i=0;i<tempArr.length;i++){
            String a="";
            String t[]= tempArr[i].split("");
            for(int j=t.length-1;j>=0;j--){
                a+=t[j];
            }
            tempArr[i] = a;
        }
        String []tempA;
        String []tempB;
        if(tempArr[0].length()>tempArr[1].length()){
            tempA = tempArr[0].split("");
            tempB = tempArr[1].split("");
        }else{
            tempB = tempArr[0].split("");
            tempA = tempArr[1].split("");
        }


        for(int i=0;i<tempA.length;i++){
            int t = 0;
            if(i>=tempB.length){
                t = Integer.parseInt(tempA[i])+tenCheck;
            }else{
                t = Integer.parseInt(tempA[i])+Integer.parseInt(tempB[i])+tenCheck;
            }

            if(t>=10){
                tenCheck=1;
            }else{
                tenCheck=0;
            }

            int tt = t%10;
            resultString =tt+resultString;
        }

        if (tenCheck==1){
            resultString = 1+resultString;
        }
        System.out.println(resultString);

    }
    
}