class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(res,new ArrayList<>(), nums);
        return res;
        
    }
    public void backtrack(List<List<Integer>> res, List<Integer> tempList, int[] nums){
        if(tempList.size()==nums.length){
            res.add(new ArrayList<>(tempList));
        }
        for(int n : nums){
            if(tempList.contains(n)) continue;
            tempList.add(n);
            backtrack(res,tempList,nums);
            tempList.remove(tempList.size()-1);
        }
    }
}
