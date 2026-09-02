class Solution {
    public int[] plusOne(int[] digits) {
        for(int index = digits.length-1;index>=0;index--){
            if(digits[index]==9){
                digits[index] = 0;
              
            }else{
                digits[index]++;
                return digits;
              

            }
        }
        int[] result = new int[digits.length+1];
        result[0] = 1;
       
        return result;
     
        
    }
}