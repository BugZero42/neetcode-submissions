class Solution {
    public int rob(int[] nums) {
        if(nums.length<2){
            return nums[0];
        }
        int[] skip1st = new int[nums.length-1];
        int[] skiplast = new int[nums.length-1];
        for(int i = 0; i<nums.length-1; i++){
            skiplast[i] = nums[i];
            skip1st[i] = nums[i+1];
        }
        int res1 = helper(skip1st);
        int res2 = helper(skiplast);
        return Math.max(res1,res2);
        
    }
    public int helper(int[] nums){
        if(nums.length<2){
            return nums[0];
        }
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for(int i =2 ; i< nums.length ; i++){
            dp[i] = Math.max(nums[i]+dp[i-2],dp[i-1]);
        }
        return dp[nums.length-1];
    }
}
