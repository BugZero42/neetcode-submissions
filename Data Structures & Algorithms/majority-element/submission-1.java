class Solution {
    public int majorityElement(int[] nums) {
        int maj = nums[0];
        int count = 1;
        for(int n : nums){
            if(n==maj) count++;
            else if(count==0) maj = n;
            else count--;
        }
        return maj;
        
    }
}