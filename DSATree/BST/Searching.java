package DSATree.BST;

import DSATree.Node;

public class Searching {

    public Node root;

    //searching
    public boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.val == key) {
            return true;

        }
        if (key > root.val) {
            return search(root.right, key);
        } else {
            return search(root.left, key);
        }
    }

}

