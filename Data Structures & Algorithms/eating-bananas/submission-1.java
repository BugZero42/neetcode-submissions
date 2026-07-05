class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = 0;
        for (int p : piles) r = Math.max(r, p);  

        while (l < r) {
            int mid = l + (r-l)/ 2;
            if (canFinish(piles, h, mid)) {
                r = mid;        
            } else {
                l = mid + 1;    
            }
        }

        return l;
    }

    private boolean canFinish(int[] piles, int h, int k) {
        int hours = 0;
        for (int p : piles) {
            hours += Math.ceil((double) p / k);
        }
        return hours <= h;
    }
}
