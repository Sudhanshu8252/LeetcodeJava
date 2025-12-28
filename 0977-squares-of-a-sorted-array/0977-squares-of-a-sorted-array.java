//TWO POINTER APPROACH -- using a new array 

class Solution {
    public int[] sortedSquares(int[] nums) {

        int n = nums.length;
        int[] result = new int[n];

        int left = 0;
        int right = n - 1;
        int k = n - 1;

        while (left <= right) {

            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if (leftSquare > rightSquare) {
                result[k] = leftSquare;
                left++;
            } else {
                result[k] = rightSquare;
                right--;
            }
            k--;
        }

        return result;
    }
}


//TWO POINTER APPROACH -- without  using with a new array 
/*
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
