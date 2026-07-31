class Solution {
    int count = 0;
    int result = 0;

    public int kthSmallest(TreeNode root, int k) {
        traversal(root, k);
        return result;
    }

    private void traversal(TreeNode node, int k) {
        if (node == null) return;
        traversal(node.left, k);
        count++;
        if (count == k) {
            result = node.val;
            return;  // stop as soon as kth found ✅
        }
        traversal(node.right, k);
    }
}