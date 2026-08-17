class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int n : nums){
            map.put(n, map.getOrDefault(n, 0)+1);
        }
        List<Integer>[] buckets = new List[nums.length+1];
        for(int n : map.keySet()){
            int frequency = map.get(n);
            if(buckets[frequency]==null){
                buckets[frequency] = new ArrayList<>();
            }
            buckets[frequency].add(n);
        }
        int count = 0;
        int[] res = new int[k];
        for(int i = nums.length; i>=0 && count<k; i--){
            if(buckets[i]==null) continue;
            for(int n : buckets[i]){
                res[count++] =n;  
            }
        }
        return res;
        
    }
}
