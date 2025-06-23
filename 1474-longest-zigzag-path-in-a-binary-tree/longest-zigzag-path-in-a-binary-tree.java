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
    int result = 0;
    public int longestZigZag(TreeNode root) {
        helper(root, true, 0);
        return result;
    }
    public void helper(TreeNode node, boolean isLeft, int count) {
        if (node == null) return;
        result = Math.max(count, result);
        if (isLeft) {
            helper(node.left, true,1);
            helper(node.right, false,  count + 1);
        } else {
            helper(node.left, true, count + 1);
            helper(node.right, false, 1);
        }
    }
}