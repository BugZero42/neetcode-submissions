
class Solution {
    public int goodNodes(TreeNode root) {
        return helper(root, 0, Integer.MIN_VALUE);
    }
    public int helper(TreeNode root, int ans, int currMax){
        if(root==null) return 0;

        int rootAnswer = 0;
        if(root.val>=currMax){
            rootAnswer = 1;
            currMax = root.val;
        }
        int leftAns = helper(root.left,ans,currMax);
        int rightAns = helper(root.right,ans,currMax);
        return leftAns + rightAns + rootAnswer;
    }
}
