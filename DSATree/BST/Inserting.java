package DSATree.BST;

import DSATree.Node;

public class Inserting {
    public Node root;

    // inserting
    public Node insert(Node root, int key) {
        Node pointer = root;
        Node follower = null;
        if (root == null) {
            return null;
        }
        while (pointer != null) {
            follower = pointer;
            if (pointer.val > key) {
                pointer = pointer.left;
            } else {
                pointer = pointer.right;
            }
        }
        Node tempNode = new Node(key);
        if (follower.val > key) {
            follower.left = tempNode;
        } else {
            follower.right = tempNode;
        }
        return root;
    }

    // using recursion
    public Node insertRecursively(Node root, int key) {
        if (root == null) {
            return new Node(key);
        }
        if (key > root.val) {
            root.right = insertRecursively(root.right, key);
        } else {
            root.left = insertRecursively(root.left, key);
        }
        return root;
    }

}
