class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(res,new ArrayList<>(),nums,0,target);
        return res;
    }
    public void backtrack(List<List<Integer>> res, List<Integer> tempList, int[] nums, int start, int target){
        if(target<0) return;
        if(target==0) res.add(new ArrayList<>(tempList));
        else{
            for(int i = start; i<nums.length; i++){
                tempList.add(nums[i]);
                backtrack(res,tempList,nums,i,target-nums[i]);
                tempList.remove(tempList.size()-1);
            }
        }
    }
}
