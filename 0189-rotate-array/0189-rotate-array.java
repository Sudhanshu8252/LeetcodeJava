class Solution {
    public void revarr(int nums[],int start, int end){
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    public void rotate(int[] nums, int k) {

        // 1 2 3 4 5 6 7
        // ------  -----
        // 7 6 5 4 3 2 1
        // 5 6 7 1 2 3 4

        // n = 7 (nums.length)
        //k = 14 (if it reverse two times then it comes to original array)

        int n = nums.length;
        if(k % n == 0){
            return;
        }
        k = k % n;

        revarr(nums ,0,nums.length-1);
        revarr(nums,0,k-1);
        revarr(nums,k,nums.length-1);
    }
}