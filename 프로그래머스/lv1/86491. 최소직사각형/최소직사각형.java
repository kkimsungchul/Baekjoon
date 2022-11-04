class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int firstBig=0;
        int secondBig = 0;
        int temp=0;
        for (int i=0;i<sizes.length;i++){
            if(sizes[i][0]<sizes[i][1]){
                temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
        }
        
        for (int j=0;j<sizes.length;j++){
            if(firstBig<sizes[j][0]){
                firstBig = sizes[j][0];
            }
            if(secondBig<sizes[j][1]){
                secondBig = sizes[j][1];
            }
        }
        
        answer = firstBig*secondBig;
        return answer;
    }
}


    
    
    
    