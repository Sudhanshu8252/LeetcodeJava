//optimized force

class Solution {
    public int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);
        int n  = nums.length;

        int closetSum = nums[0] + nums[1] + nums[2] ;

        for(int i = 0; i<n-2 ;i++){
           int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (Math.abs(target - sum) < Math.abs(target - closetSum)) {
                    closetSum = sum;
                }

                if (sum < target) {
                    left++;
                } else if (sum > target) {
                    right--;
                } else {
                    return sum;
                }
            }
        }
        return closetSum;

            

        }
     }











/*
//BRUTE FORCE

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;

        int closetSum = nums[0] + nums[1] + nums[2];

        for(int i=0;i<n;i++){
            for(int j= i +1 ;j<n;j++){
                for(int k= j+1;k<n;k++){
                    int sum = nums[i] + nums[j] + nums[k];

                    if(Math.abs(target-sum) < Math.abs(target - closetSum)) closetSum = sum;
                }
            }
        }
        return closetSum;


    }
}
*/