//TWO POINTER APPROACH -- using a new array 

/*class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int []result = new int [n];

        int left =0;
        int right = n-1;
        int index= n-1;

        while(left<= right){
            // beacuse in odd array last element will remain so we are using while (left <= right) for taking the
          if(Math.abs(nums[left])> Math.abs(nums[right])){
            // we are taking absolute value so we dont have to focus on positive or negatives values.

            // case 1 : when left is bigger
            result[index] = nums[left] * nums[left];
            left ++;
          }else{
            // case 2 : when right is bigger
            result[index] = nums[right] * nums[right];
            right--;
          }
          index --;
    }
    return result;
}
}*/


//TWO POINTER APPROACH -- using with a new array 

class Solution {
    public int[] sortedSquares(int[] nums) {

        int n = nums.length;

        for (int i = 0; i < n; i++) {
            nums[i] = nums[i] * nums[i];
        }

        int left = 0, right = n - 1;

        while (left < right) {
            if (nums[left] > nums[right]) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }
            left++;
        }

        Arrays.sort(nums);
        return nums;
    }
}


/*
//BRUTE FORCE

class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i] = nums[i]* nums[i];
        }
        Arrays.sort(nums);
         return nums;
    }
   
}
*/
