class Solution {
    public void sortColors(int[] nums) {
        int l =0;
        int mid = 0;
        int r = nums.length-1;
        while(mid<=r){
            switch(nums[mid]){
                case 0:
                    swap(nums,mid,l);
                    mid++;
                    l++;
                    break;
                case 1:
                    mid ++;
                    break;
                case 2:
                    swap(nums,mid,r);
                    r--;
                    break;
            }
        }   
    }
    public void swap(int[] nums, int x, int y){
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
}