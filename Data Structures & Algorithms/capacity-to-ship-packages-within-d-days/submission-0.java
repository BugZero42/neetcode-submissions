class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int l = 0;
        int r = 0;
        for (int w : weights) {
            l = Math.max(l, w);  
            r += w;              
        }

        while (l < r) {                        
            int mid = (l + r) / 2;            
            if (canShip(weights, days, mid)) { 
                r = mid;                       
            } else {
                l = mid + 1;                  
            }
        }

        return l;                             
    }

    private boolean canShip(int[] weights, int days, int cap) { 
        int daysNeeded = 1;  
        int load = 0;

        for (int w : weights) {              
            if (load + w > cap) {
                daysNeeded++;                 
                load = 0;
            }
            load += w;                       
        }

        return daysNeeded <= days;            
    }
}