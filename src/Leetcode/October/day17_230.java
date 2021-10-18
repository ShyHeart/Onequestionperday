package Leetcode.October;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//https://leetcode-cn.com/problems/kth-smallest-element-in-a-bst/
public class day17_230 {
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

    List<Integer>list=new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        dfs(root);
        Collections.sort(list);
        return list.get(k-1);
    }

    private void dfs(TreeNode root) {
        if (root==null)return;
        list.add(root.val);
        dfs(root.left);
        dfs(root.right);
    }

}
