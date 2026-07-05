/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {  

    public String PreOrderTraversal(TreeNode node){
        if(node==null){
            return "null";
        }
        StringBuilder sb = new StringBuilder("^");
        sb.append(node.val);
        sb.append(PreOrderTraversal(node.left));
        sb.append(PreOrderTraversal(node.right));

        return sb.toString();

    }

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {

        String A = PreOrderTraversal(root);
        String B = PreOrderTraversal(subRoot);
        if(A.contains(B)){
            return true;
        }
        else{
            return false;
        }

    }
}
