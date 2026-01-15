class Solution {
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];

  // Step 1: Detect cycle
        // do { 
        //     slow = nums[slow]; 
        //     fast = nums[nums[fast]]; 
        //     }

        while(true){
            slow = nums[slow];
            fast = nums[nums[fast]];


            if(slow == fast){
                break;
            }
        }

           // Step 2: Find entry point of cycle

           slow = nums[0];

           while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
           }
           return slow;
    }


}






















/*class Solution {
    public int findDuplicate(int[] nums) {

        for(int i = 0 ;i< nums.length;i++){
            for(int j= i+1; j<nums.length;j++){
                if (nums[i] == nums[j]){
                    return nums[i];
                }
            }
        }
        
        return -1;
    }
}
*/