package util;

import DSATree.Node;

public class Utility {

    public Node root;

    public static void preOrder(Node root) {
        if (root == null) {
            return;
        } else {
            System.out.print(root.val + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    // postOrder
    public static void postOrder(Node root) {
        if (root == null) {
            return;
        } else {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.val + " ");
        }
    }

    //Inorder
    public static void inOrder(Node root) {
        if (root == null) {
            return;
        } else {
            inOrder(root.left);
            System.out.print(root.val + " ");
            inOrder(root.right);
        }
    }

    //level Order
    public static void levelOrder(Node root, int level) {
        if (root == null) {
            return;
        }
        if (level == 1) {
            System.out.print(root.val + " ");
        } else {
            levelOrder(root.left, level - 1);
            levelOrder(root.right, level - 1);
        }
    }

    // finding level of tree
    public static int levelHeights(Node root) {
        if (root == null) {
            return 0;
        }
        int left = levelHeights(root.left);
        int right = levelHeights(root.right);
        return Math.max(left, right) + 1;
    }

    // using recursion helper
    public void recursionHelper() {
        int levelHeight = levelHeights(root);
        for (int level = 1; level <= levelHeight; level++) {
            levelOrder(root, level);
        }
    }
}
