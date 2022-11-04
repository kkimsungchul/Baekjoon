import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 1;
        int getCount = nums.length/2;
        //HashSet을 몰랏을때 아래와 같이햇음
//         HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
//         for(int i=0;i<nums.length;i++){
//             map.put(nums[i],nums[i]);
//         }
        
//         if(map.size()>getCount){
//             return getCount;
//         }else{
//             return map.size();
//         }
        HashSet<Integer> hashSet = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            hashSet.add(nums[i]);
        }
        if(hashSet.size()>getCount){
            return getCount;
        }else{
            return hashSet.size();
        }
        

    }
}