
class Solution {
    int count = 0;
    int curr = 0;
    public int kthSmallest(TreeNode root, int k) {
        traversal(root,k);
        return curr;
    }
    public void traversal(TreeNode root, int k){
        if(root==null) return;
        traversal(root.left,k);
        count++;
        if(count==k){
            curr = root.val;
            return;
        }
        traversal(root.right,k);
    }
}
