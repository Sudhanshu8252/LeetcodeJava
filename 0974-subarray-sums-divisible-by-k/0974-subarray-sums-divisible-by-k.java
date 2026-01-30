//WITHOUT HAShMAP

class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int freq[] = new int [k];
        freq [0] = 1;

        int prefix_Sum = 0;
        int count =0;

        for(int i=0;i<nums.length;i++){
            prefix_Sum += nums[i];

            int remainder = prefix_Sum % k;

            if(remainder < 0) remainder+=k;

            count += freq[remainder];
            freq[remainder]++;
        }
        return count;


    }
}







































/*
//WITH HASHMAP
class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer>map = new HashMap<>();
        map.put(0,1);

        int PrefixSum = 0;
        int count = 0;

        for(int i=0;i<nums.length;i++){
            PrefixSum += nums[i];

            int remainder = PrefixSum %k;

            if(remainder < 0) remainder += k;

            if(map.containsKey(remainder)) {
                count += map.get(remainder);
            }

            map.put(remainder, map.getOrDefault(remainder,0)+1);
            
        }
        return count;

    }
}

*/