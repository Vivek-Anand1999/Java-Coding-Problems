package BinarySearchTree.Searching;


import BinarySearchTree.Node;

public class Searching {
    public Node root;

    public void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);
    }

    //searching
    public int searchingKey(Node root, int key) {
        if (root == null) {
            return -1;
        }
        if (root.val == key) {
            return 1;
        }
        if (root.val > key) {
            return searchingKey(root.left, key);
        } else {
            return searchingKey(root.right, key);
        }
    }
}
