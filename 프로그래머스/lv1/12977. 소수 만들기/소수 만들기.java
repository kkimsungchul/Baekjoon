class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int sum=0;
        
        for(int i=0;i<nums.length;i++){
            int count=0;
            
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    
                    sum=nums[i]+nums[j]+nums[k];
                    for(int a=1;a<=sum;a++){
                        if(sum%a==0){
                            count++;
                        }
                    }
                    if(count==2){
                        answer++;
                    }
                    count=0;
                }
            }
        }
            

        return answer;
    }
}