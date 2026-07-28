class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        // find pivot (minimum element index)
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        int pivot = left;

        // decide which half to search
        int l, r;
        if (target >= nums[pivot] && target <= nums[nums.length - 1]) {
            l = pivot;              // search right half
            r = nums.length - 1;
        } else {
            l = 0;                  // search left half
            r = pivot - 1;
        }

        // standard binary search
        while (l <= r) {            // ✅ l<=r
            int mid = l + (r - l) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] > target) r = mid - 1;  
            else l = mid + 1;                           
        }
        return -1;
    }
}