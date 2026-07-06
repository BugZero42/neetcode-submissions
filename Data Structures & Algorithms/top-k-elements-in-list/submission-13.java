class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer>[] bucket = new List[nums.length+1];

        for(int n : nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }

        for(int key : map.keySet()){
            int frequency = map.get(key);
            if(bucket[frequency]==null){
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(key);
        }
        int[] res = new int[k];
        int counter = 0;
        for(int i = nums.length ; i>=0 && counter<k ; i--){
            if(bucket[i]==null){
                continue;
            }
            for(Integer n : bucket[i]){
                res[counter++] = n;
            }
        }
        return res;


        
    }
}
