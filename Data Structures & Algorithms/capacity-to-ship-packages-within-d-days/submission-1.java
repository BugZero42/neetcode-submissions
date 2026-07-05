class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int min = 0;
        int max = 0;
        for(int n : weights){
            min = Math.max(min, n);
            max+=n;
        }
        while(min<max){
            int mid = min + (max-min)/2;
            if(canship(weights,days,mid)){
                max = mid;
            }
            else{
                min = mid+1;
            }
        }
        return min;   
    }
    public boolean canship(int[] weights, int days, int capacity){
        int daysneeded = 1;
        int load = 0;
        for(int w : weights){
            if(load+w>capacity){
                daysneeded++;
                load =0;
            }
            load+=w;
        }
        return daysneeded<=days;
    }

}