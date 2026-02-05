class Solution {
    public int[] constructTransformedArray(int[] A) {
        int n = A.length;
        int[] result = new int[n];
        for(int i = 0; i < n; i ++){
            result[i] = A[((i + A[i]) % n + n) % n];
        }
        return result;  

        
       
    }
}
