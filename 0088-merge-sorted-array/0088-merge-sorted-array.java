//BACKWARD TWO POINTER : “Forward two pointer overwrites unprocessed elements in nums1, causing data loss. That’s why we merge from the end.”


class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i= m - 1;
        int j= n - 1;
        int k= m + n - 1; 

        while(i>=0 && j >=0){
            if(nums1[i] > nums2[j]){
                nums1[k] = nums1[i];
                i--;

            }else{
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
        while(j>=0){
            nums1[k]=nums2[j];
            j--;
            k--;
        }
    }
}
















/*
//Brute Force
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = m;

        for(int i=0;i<n;i++){
            nums1[index]=nums2[i];
            index++;
        }
        Arrays.sort(nums1);
        
    }
}

*/