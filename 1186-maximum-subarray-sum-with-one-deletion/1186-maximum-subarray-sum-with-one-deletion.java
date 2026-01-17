class Solution {
    public int maximumSum(int[] arr) {

        int n = arr.length;


        int noDelete = arr[0];
        int oneDelete = Integer.MIN_VALUE;
        int ans = arr[0];

        for(int i = 1;i < n;i++){

            if(oneDelete != Integer.MIN_VALUE){
                 oneDelete = Math.max(oneDelete + arr[i], noDelete);

            }else{
                 oneDelete = noDelete; // delete current element

            }
           
            noDelete = Math.max(arr[i] , noDelete + arr[i]);
            ans = Math.max(ans,Math.max(noDelete,oneDelete));
        }
        return ans;


        
    }
}