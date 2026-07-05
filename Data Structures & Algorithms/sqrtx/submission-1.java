class Solution {
    public int mySqrt(int x) {
        if (x < 2) return x;  // handles 0 and 1

        int l = 1;
        int r = x / 2;
        int res = 0;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            long sqr = (long) mid * mid;  // cast to long to prevent overflow

            if (sqr == x) return mid;
            else if (sqr < x) {
                res = mid;
                l = mid + 1;
            }
            else {
                r = mid - 1;
            }
        }

        return res;
    }
}