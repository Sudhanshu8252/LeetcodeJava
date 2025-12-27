//OPTIMIZED SOLUTION

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n =nums.length;
        int left =0;
        int sum =0;
        int minLen = Integer.MAX_VALUE;

        for(int right = 0 ;right<n;right++){
            sum += nums[right];

            while(sum >=target){
                minLen = Math.min(minLen,right-left+1);
                sum = sum-nums[left];
                left++;
            }
        }

        if(minLen==Integer.MAX_VALUE){
            return 0;
        }
        else{
            return minLen;
        }

        
    }
}

/*
//BRUTE FORCE
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;

        int minLen = Integer.MAX_VALUE;

        for(int i =0;i< n;i++){
            int sum  =0;
            for(int j =i;j<n;j++){
                sum = sum + nums[j];

                if(sum >=target){
                    minLen=Math.min(minLen,j-i+1);
                    break;
                }
            }
        }
        if(minLen==Integer.MAX_VALUE){
            return 0;
        }else{
            return minLen;
        }
        
    }
}
*/