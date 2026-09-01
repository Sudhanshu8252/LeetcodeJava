class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0;
        int j = 0;

        List<Integer> result = new ArrayList<>();

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                result.add(nums1[i]);
                i++;
                j++;
            }
        }

        // int answer[] = new int[result.size()];

        // for(int k = 0;k<result.size();k++ ){
        //     answer[k] = result.get(k);                        //using normal loop
        // }
        // return answer;

        int[] answer = new int[result.size()];

        int index = 0;

        for (int num : result) {
            answer[index] = num;
            index++;
        }
        return answer;
    }
}



/*class Solution {
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
*/