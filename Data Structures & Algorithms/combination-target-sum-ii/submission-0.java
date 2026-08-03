class Solution {
    public List<List<Integer>> combinationSum2(int[] nums, int target) {

        Arrays.sort(nums);

        List<List<Integer>> res = new ArrayList<>();
        backtrack(res, new ArrayList<>(), nums, 0, target);
        return res;
    }

    public void backtrack(List<List<Integer>> res,
                          List<Integer> tempList,
                          int[] nums,
                          int start,
                          int target) {

        if (target == 0) {
            res.add(new ArrayList<>(tempList));
            return;
        }

        for (int i = start; i < nums.length; i++) {

            if (i > start && nums[i] == nums[i - 1])
                continue;

            if (nums[i] > target)
                break;

            tempList.add(nums[i]);

            backtrack(res, tempList, nums, i + 1, target - nums[i]);

            tempList.remove(tempList.size() - 1);
        }
    }
}