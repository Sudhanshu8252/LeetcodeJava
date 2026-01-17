class Solution {
    public int maxProduct(int[] nums) {
        int maxEnding = nums[0];
        int minEnding = nums[0];
        int result = nums[0];

        for(int i=1;i<nums.length;i++){
            int temp = maxEnding;

            maxEnding = Math.max(nums[i], Math.max( nums[i] * maxEnding , nums[i] * minEnding));
            minEnding = Math.min(nums[i],Math.min(nums[i] * temp , nums[i] * minEnding));

            result = Math.max(result,maxEnding);
        }
        return result;
        
    }
}


/*
class Solution {
    public int maxProduct(int[] nums) {
        int maxProduct = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int product = 1;
            for (int j = i; j < nums.length; j++) {
                product *= nums[j];
                maxProduct = Math.max(maxProduct, product);
            }
        }
        return maxProduct;
    }
}
*/