//Optimized
class Solution {
    public int totalFruit(int[] fruits) {

        HashMap<Integer,Integer>map = new HashMap<>();

        int left =0;
        int maxLen =0;
        int n = fruits.length;

        for(int right =0;right<n;right++){
            map.put(fruits[right],map.getOrDefault(fruits[right],0) +1);

            while(map.size()>2){
                map.put(fruits[left], map.get(fruits[left]) - 1);
                if (map.get(fruits[left]) == 0) {
                    map.remove(fruits[left]);
            }
            left++;
        }
        maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}


/*class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        int maxLen = 0;
        for(int i =0;i< n;i++){
        HashSet<Integer> set = new HashSet <>();
        for(int j = i;j<n;j++){
            set.add(fruits[j]);
            if(set.size()>2)break;

            
            maxLen = Math.max(maxLen,j-i+1);
        }


        }
        return maxLen;
        
    }
}
*/