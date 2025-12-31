class Solution {
    public int lengthOfLongestSubstring(String s) {
         int n = s.length();
        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            HashSet<Character> set = new HashSet<>();

            for (int j = i; j < n; j++) {
                char ch = s.charAt(j);

                if (set.contains(ch)) {
                    break;
                }

                set.add(ch);
                maxLen = Math.max(maxLen, j - i + 1);
            }
        }

        return maxLen;

    }
}



/*

class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        HashMap<Character,Integer>map = new HashMap<>();
        int maxlen = 0; 
        int left = 0;
    for(int right = 0;right<s.length();right++){
        char currentChar = s.charAt(right);
        if(map.containsKey(currentChar)){
            left = Math.max(map.get(currentChar)+1,left);
        }
        map.put(currentChar,right);
        maxlen = Math.max(maxlen,right-left+1);
    }
    return maxlen;
    }
}
*/