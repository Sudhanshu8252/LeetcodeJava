class Solution {
    public int maxSubArray(int[] nums) {
        int Currsum = nums[0];
        int Maxsum = nums[0];

        for(int i=1;i<nums.length;i++){
            Currsum = Math.max(nums[i],Currsum + nums[i]);
            Maxsum = Math.max(Currsum , Maxsum);


             if(Currsum < 0){
                Currsum =0;
            }


        }
        return Maxsum;
    }
}








/*class Solution {
    public int maxSubArray(int[] nums) {

        int Maxsum = Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            int sum =0;
            for(int j=i;j<nums.length;j++){

                sum += nums[j];
                Maxsum = Math.max(sum,Maxsum);

            }
        }
        return Maxsum;

        
    }
}
*/