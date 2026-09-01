class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer>map= new HashMap<>();

        for(int num : nums1){
            map.put(num,map.getOrDefault(num,0)+ 1);
        }

        int[] result =  new int[Math.min(nums1.length,nums2.length)];
        int index = 0;

        for(int num : nums2){
            if(map.containsKey(num)){
                result[index] = num;
                index++;

                int frequency = map.get(num);

                if(frequency==1){
                    map.remove(num);
                }else{
                    map.put(num, frequency-1);
                }

            }
        }
        return Arrays.copyOf(result,index);

        
    }
}