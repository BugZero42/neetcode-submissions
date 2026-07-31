class Solution {
    public boolean isValidBST(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        traversal(root,res);
        int curr = res.get(0);
        for(int i = 1; i< res.size(); i++){
            if(res.get(i)>curr){
                curr = res.get(i);
            }
            else{
                return false;
            }
        }
        return true;
        
        
    }
    public void traversal(TreeNode root, List<Integer> res){
        if(root==null) return;
        traversal(root.left,res);
        res.add(root.val);
        traversal(root.right,res);
    }
}
