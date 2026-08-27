class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;

       int writer = 0;
       for(int scanner = 1;scanner<nums.length;scanner++){
        if(nums[writer] != nums[scanner]){
            writer++;
            nums[writer] = nums[scanner];
        }
       }
       return writer + 1 ;
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
*/








