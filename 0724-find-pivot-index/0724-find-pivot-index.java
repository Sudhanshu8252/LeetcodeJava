class Solution {
    public int pivotIndex(int[] nums) {

        int total_Sum = 0;
       
        for (int i = 0; i < nums.length; i++) {
            total_Sum += nums[i];
        }

        int left_Sum = 0;


        for(int i =0;i<nums.length;i++){
            int right_sum = total_Sum - left_Sum - nums[i];

             if(left_Sum == right_sum){
            return i;
        }
       

        
        left_Sum += nums[i];

        }
        return -1;



       
    }
}