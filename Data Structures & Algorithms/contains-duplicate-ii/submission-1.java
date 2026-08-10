class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int low  = 0;
        int high = 0;
        HashSet<Integer> set = new HashSet<>();
        while(high<nums.length){
            if(high-low>k){
                set.remove(nums[low++]);
            }
            if(set.contains(nums[high])) return true;

            set.add(nums[high++]);   
        }
        return false;
    }
}