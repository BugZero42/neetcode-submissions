class Solution {
    public int reverseBits(int n) {

        int res = 0;
        for(int shift = 31; shift>=0; shift --){
            int x = n&1;
            res = res + (x<<shift);
            n= n>>1;
        }
        return res;
        
    }
}
