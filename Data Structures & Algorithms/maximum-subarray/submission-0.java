class Solution {
    public int maxSubArray(int[] nums) {

        int currmax = nums[0];
        int maxsofar = nums[0];

        for(int i =1; i<nums.length; i++){

            currmax = Math.max(nums[i],currmax+nums[i]);

            maxsofar = Math.max(currmax, maxsofar);
        }
        return maxsofar;


        
    }
}










//Kadanes Algorithm
