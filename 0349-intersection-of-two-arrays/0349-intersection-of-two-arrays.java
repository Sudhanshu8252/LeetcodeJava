class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s1 = new HashSet<>();

        for(int num : nums1){
            s1.add(num);
        }
        int answer[] = new int[Math.min(nums1.length,nums2.length)];
        int index = 0;

        for(int num : nums2){
            if(s1.contains(num)){
                answer[index] = num;
                index++;
                s1.remove(num);
            }
        }
        return Arrays.copyOf(answer,index);
    }
}



























/*
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();

        for(int num : nums1){
            s1.add(num);
        }

        for(int num : nums2){
            s2.add(num);
        }

        s1.retainAll(s2);

        int[] answer = new int[s1.size()];
        int index = 0;

        for(int num : s1){
            answer[index] = num;
            index++;
        }
        return answer;

        
    }
}
*/