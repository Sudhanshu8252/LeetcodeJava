class Solution {
    public void sortColors(int[] nums) {

        int low = 0 ;
        int mid = 0;
        int high = nums.length-1;


        while(mid <= high){

            if(nums[mid] == 0){
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;

            }

            else if (nums[mid] == 1){
                mid++;

            } else {
                int temp = nums[high];
                nums[high] = nums[mid];
                nums[mid] = temp;
                high--;
            }
        }

    }
}


/*

//BETTER SOLUTION
class Solution {
    public void sortColors(int[] nums) {

        int zero = 0 , one = 1 ,two = 2 ;

        for(int num : nums){
            if(num == 0) zero++;

            else if (num == 1) one++;

            else  two++;
        }

        int index = 0;

        while(zero-- > 0) nums[index++] = 0;

        while(one-- > 1) nums[index++] = 1;

        while(two-- > 2) nums[index++] = 2;

    }
}

*/



/*
//BRUTE FORCE

class Solution {
    public void sortColors(int[] nums) {
        Arrays.sort(nums);
    }
}

*/