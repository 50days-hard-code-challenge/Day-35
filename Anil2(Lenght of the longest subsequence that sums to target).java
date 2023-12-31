class Solution {
    public int lengthOfLongestSubsequence(List<Integer> nums, int target) { 
          int ans =  helper(nums,0,target);
         
          return ans <=0  ?  -1 :ans  ;
    }
     public int helper(List<Integer> nums, int i, int remainingTarget){
        // base case
        if(i==nums.size()){
            //return remainingTarget == 0 ? 0 : Integer.MIN_VALUE;
            if(remainingTarget == 0){
              return 0;
            }
            else{
              return Integer.MIN_VALUE;
            }
        }
        

        // Recursive call 
        
        // Pick the element 
        int include = 1 + helper(nums,i+1,remainingTarget-nums.get(i));

        // Do-not pick the element 
        int exclude = helper(nums,i+1,remainingTarget);
        
        return Math.max(include,exclude);
    }
}
