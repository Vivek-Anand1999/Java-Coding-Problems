package LeetCode;

public class SumOfLeftLeaf_404 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.root = new TreeNode(3);
        solution.root.left = new TreeNode(9);
        solution.root.right = new TreeNode(20);
        solution.root.right.left = new TreeNode(15);
        solution.root.right.right = new TreeNode(7);
        System.out.println(solution.sumOfLeftLeaves(solution.root));
    }
}

class Solution {
    public TreeNode root;

    public int sumOfLeftLeaves(TreeNode root) {
        return leftSum(root, 0);
    }

    private int leftSum(TreeNode root, int sum) {
        if (root == null) return 0;
        if (root.left != null && root.left.left == null && root.left.right == null) {
            sum += root.left.val;
        }
        leftSum(root.left, sum);
        leftSum(root.right, sum);
        return sum;
    }

}

class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }

}