package DSATree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TreeTraversal {
    public Node root;

    /* Recursion*/
    // pre Order
    public void preOrder(Node root) {
        if (root == null) {
            return;
        } else {
            System.out.print(root.val + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    // postOrder
    public void postOrder(Node root) {
        if (root == null) {
            return;
        } else {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.val + " ");
        }
    }

    //Inorder
    public void inOrder(Node root) {
        if (root == null) {
            return;
        } else {
            inOrder(root.left);
            System.out.print(root.val + " ");
            inOrder(root.right);
        }
    }

    //level Order
    public void levelOrder(Node root, int level) {
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

    // using recursion helper
    public void recursionHelper() {
        int levelHeight = levelHeights(root);
        for (int level = 1; level <= levelHeight; level++) {
            levelOrder(root, level);
        }
    }

    // finding level of tree
    public int levelHeights(Node root) {
        if (root == null) {
            return 0;
        }
        int left = levelHeights(root.left);
        int right = levelHeights(root.right);
        return Math.max(left, right) + 1;
    }

    // counting node
    public int countNode(Node root) {
        if (root == null) {
            return 0;
        }
        int left = countNode(root.left);
        int right = countNode(root.right);
        return left + right + 1;
    }

    // counting the height of a tree
    public int countHeight(Node root) {
        if (root == null) {
            return 0;
        }
        int left = countHeight(root.left);
        int right = countHeight(root.right);
        return Math.max(left, right) + 1;
    }

    //counting only leaf node
    public int countingLeafNode(Node root){
        if(root.left == null && root.right == null){
            return 1;
        }
        int left = countingLeafNode(root.left);
        int right = countingLeafNode(root.right);
        return left+right;
    }

    // counting non-leaf node
    public int countingNonLeafNode(Node root){
        if(root == null){
            return 0;
        }

        int left = countingNonLeafNode(root.left);
        int right = countingNonLeafNode(root.right);
        if(root.left != null || root.right != null){
            return left+right+1;
        }else{
            return left+right;
        }

    }


}

class IterativeWay {
    public Node root;

    //preOrder
    public void preOrder() {
        Stack<Node> nodeAddress = new Stack<>();
        Node pointer = root;
        while (pointer != null || !nodeAddress.isEmpty()) {
            if (pointer != null) {
                System.out.print(pointer.val + " ");
                nodeAddress.push(pointer);
                pointer = pointer.left;
            }

            if (pointer == null) {
                pointer = nodeAddress.pop();
                pointer = pointer.right;
            }
        }

    }

    //postOrder
    public void postOrder() {
        Stack<Node> firstVisit = new Stack<>();
        Stack<Node> secondVisit = new Stack<>();
        Node pointer = root;
        while (pointer != null || !firstVisit.isEmpty()) {
            if (pointer != null) {
                firstVisit.push(pointer);
                pointer = pointer.left;
            } else {
                pointer = firstVisit.pop();
                if (!secondVisit.isEmpty() && secondVisit.peek() == pointer) {
                    secondVisit.pop();
                    System.out.print(pointer.val + " ");
                    pointer = null;
                } else {
                    secondVisit.push(pointer);
                    firstVisit.push(pointer);
                    pointer = pointer.right;
                }

            }
        }
    }

    // Inorder
    public void inOrder() {
        Stack<Node> nodeAddress = new Stack<>();
        Node pointer = root;
        while (pointer != null || !nodeAddress.isEmpty()) {
            if (pointer != null) {
                nodeAddress.push(pointer);
                pointer = pointer.left;
            } else {
                pointer = nodeAddress.pop();
                System.out.print(pointer.val + " ");
                pointer = pointer.right;
            }
        }
    }

    //levelOrder
    public void levelOrder() {
        Queue<Node> nodeAddress = new LinkedList<>();
        Node pointer = root;
        System.out.print(pointer.val + " ");
        nodeAddress.add(pointer);
        while (!nodeAddress.isEmpty()) {
            pointer = nodeAddress.poll();
            if (pointer.left != null) {
                nodeAddress.add(pointer.left);
                System.out.print(pointer.left.val + " ");
            }
            if (pointer.right != null) {
                nodeAddress.add(pointer.right);
                System.out.print(pointer.right.val + " ");
            }

        }
    }
}
