class Solution {
    public int subarraySum(int[] nums, int k) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        int result = 0;
        int prefixsum = 0;
        map.put(0,1);

        for(int num : nums){
            prefixsum+=num;
            if(map.containsKey(prefixsum-k)){
                result+=map.get(prefixsum-k);
            }
            map.put(prefixsum, map.getOrDefault(prefixsum, 0)+1);
            
        }
        return result;

    }
}