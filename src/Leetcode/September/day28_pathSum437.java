package Leetcode.September;

/**
 * @作者 Heart
 * @时间 2021/9/30 21:00
 */

//https://leetcode-cn.com/problems/path-sum-iii/
public class day28_pathSum437 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    int ans, t;

    public int pathSum(TreeNode root, int targetSum) {

        t = targetSum;
        dfs1(root);

        return ans;
    }

    private void dfs1(TreeNode root) {
        if (root == null) return;
        dfs2(root, root.val);
        dfs1(root.left);
        dfs1(root.right);
    }

    private void dfs2(TreeNode root, int val) {
        if (val == t) ans++;
        if (root.left != null) dfs2(root.left, val + root.left.val);
        if (root.right != null) dfs2(root.right, val + root.right.val);
    }

}
