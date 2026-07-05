class Solution {
    public boolean canJump(int[] nums) {
        int maxReach =0;
        int i =0 ;
        int res =0;
        while(i<=res && i<nums.length){
            maxReach = i + nums[i];
            res = Math.max(res,maxReach);
            i++;
        }
        if(res>=nums.length-1) return true;
        else return false;

        
    }
}
