class Solution {
    public int removeDuplicates(int[] nums) {

        if(nums.length==0) return 0;

        int i=0;
        int j=1;

        while(j<nums.length){
            if(nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }
            j++;
        }
        return i+1;
    

        
    }
}




/*
class Solution {
    public int removeDuplicates(int[] nums) {
    

     HashSet<Integer> set = new HashSet<>();

        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(nums[i])) {
                set.add(nums[i]);
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
}
}
/*









/*
//BRUTE FORCE

class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j]) {
                    for (int k = j; k < n - 1; k++) {
                        nums[k] = nums[k + 1];
                    }
                    n--;
                    j--;
                }
            }
        }
        return n;
    
        
       }
       }
    
    */
