class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(res,new ArrayList<>(),nums, 0);
        return res;
    }
    public void backtrack(List<List<Integer>> res ,List<Integer> tempList, int[] nums, int start){
        res.add(new ArrayList<>(tempList));
        for(int i = start; i< nums.length; i++){
            tempList.add(nums[i]);
            backtrack(res,tempList,nums,i+1);
            tempList.remove(tempList.size()-1);
        }
    }
}
/*
void backtrack(parameters) {
    if (base case reached) {
        save result;
        return;
    }

    for (each possible choice) {
        make the choice;          // add to current path
        backtrack(next state);    // go deeper
        undo the choice;          // remove from current path
    }
}
*/














































