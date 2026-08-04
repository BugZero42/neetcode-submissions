class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);                                    // change 1
        backtrack(res, new ArrayList<>(), nums, new boolean[nums.length]); // change 2
        return res;
    }

    public void backtrack(List<List<Integer>> res, List<Integer> tempList,
                          int[] nums, boolean[] used) {
        if (tempList.size() == nums.length) {
            res.add(new ArrayList<>(tempList));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue;                            // change 3a
            if (i > 0 && nums[i] == nums[i-1] && !used[i-1]) continue; // change 3b
            used[i] = true;
            tempList.add(nums[i]);
            backtrack(res, tempList, nums, used);
            used[i] = false;
            tempList.remove(tempList.size() - 1);
        }
    }
}