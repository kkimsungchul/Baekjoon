public class Main{
    public static void main(String[]args){
        boolean check[] = new boolean[10000];
        for(int i=0;i<check.length;i++){
            int temp = getSelfNumber(i);
            if(temp<10000){
                check[temp]=true;
            }

        }
        for(int i=0;i<check.length;i++){
            if(!check[i]){
                System.out.println(i);
            }
        }
    }
    public static int getSelfNumber(int a){
        int temp=a;
        int sum=0;
        String t[] = String.valueOf(temp).split("");
        for(int i=0;i<t.length;i++){
            sum+=Integer.parseInt(t[i]);
        }
        return temp+sum;
    }
}