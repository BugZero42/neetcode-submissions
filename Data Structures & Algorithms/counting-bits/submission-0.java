class Solution {
    public int[] countBits(int n) {

        int[] arr = new int[n+1];

        for(int i =0; i<=n; i++){
            int result = 0;
            int helper = 1;
            for(int j =0; j< 32; j++){
                if((helper & i)!=0){
                    result++;
                }
                helper = helper<<1;
            }  
            arr[i] = result;
        }
        return arr;   
    }
}
