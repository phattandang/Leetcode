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
    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) return 0;
        int helper = traverse(root, targetSum);
        int left = pathSum(root.left, targetSum);
        int right = pathSum(root.right, targetSum);
        return left + right + helper;
    }
    public int traverse(TreeNode node, long sum) {
        if (node == null) return 0;
        int count = 0;
        if (node.val == sum) {
            count++;
        }
        count += traverse(node.left, sum - node.val);
        count += traverse(node.right, sum - node.val);
        return count;
    }   
}