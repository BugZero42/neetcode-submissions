class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int size = nums.length / 3;

        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        List<Integer> res = new ArrayList<>();
        for (int key : map.keySet()) {      // ✅ iterate unique keys only
            if (map.get(key) > size) {
                res.add(key);               // ✅ no contains check needed
            }
        }
        return res;
    }
}