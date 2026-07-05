class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;

        while (l <= r) {
            // Prevents potential overflow
            int m = l + (r - l) / 2;

            if (nums[m] == target) {
                return m; // Found it!
            } else if (nums[m] < target) {
                l = m + 1; // Target is in the right half
            } else {
                r = m - 1; // Target is in the left half
            }
        }

        return -1; // Target not found
    }
}
