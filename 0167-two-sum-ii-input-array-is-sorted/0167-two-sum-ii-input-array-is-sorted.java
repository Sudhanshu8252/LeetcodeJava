 //BETTER APPROACH - HASHMAP
  
 class Solution {
    public int[] twoSum(int[] numbers, int target) {


    HashMap<Integer,Integer> map = new HashMap<>();

    for(int i=0;i<numbers.length;i++){
        int x = target -numbers[i];

        if(map.containsKey(x)){
            return new int[]{map.get(x)+1,i+1};
        }

        map.put(numbers[i],i);
    }
      
      return new int []{-1,-1};

    }
 }
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 /*
 //BRUTE FORCE 
class Solution {
    public int[] twoSum(int[] numbers, int target) {
          for(int i= 0;i<numbers.length-1;i++){
            for(int j= i+1;j<numbers.length;j++){
                if(numbers[i] + numbers[j]== target){
                    return new int[]{i+1,j+1};
                }
            }
          }

          return new int []{-1,-1};
        
    }
}

*/