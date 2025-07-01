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
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer> list = new ArrayList<>();
        dfs(root, list, targetSum);
        return res;
    }
    private void dfs(TreeNode node, List<Integer> list, int remainingSum) {
        if(node == null) return;
        list.add(node.val);
        if(node.left == null && node.right == null && remainingSum == node.val) {
            res.add(new ArrayList<>(list));
        }
        dfs(node.left, list, remainingSum - node.val);
        dfs(node.right, list, remainingSum - node.val);
        list.remove(list.size() - 1);
    }

}