
class Solution {
    public int maxSubArray(int[] nums) {

        int i=0;
        int n=nums.length;
        int ans=nums[0] ;


        int best_ending =nums[0];

        for(i=1;i<n;i++)
        {
            int v1=best_ending+nums[i];

            int v2=nums[i];

            best_ending=Math.max(v1,v2);

            ans=Math.max(ans,best_ending);

        }

        return ans;

        
    }
}






/*class Solution {
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
*/








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