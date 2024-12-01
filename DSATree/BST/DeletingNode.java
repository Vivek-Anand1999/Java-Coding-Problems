package DSATree.BST;

import DSATree.Node;
import util.Utility;

public class DeletingNode {
    public Node root;

    //Delete
    public Node delete(Node pointer, int key) {
        if (pointer == null) {
            return null;
        }
        if ((pointer.left == null && pointer.right == null) && pointer.val == key) {
            return null;
        }

        if (key > pointer.val) {
            pointer.right = delete(pointer.right, key);
        } else if (key < pointer.val) {
            pointer.left = delete(pointer.left, key);
        } else {
            if (height(pointer.left) > height(pointer.right)) {
                Node predecessorNode = inOrderPredecessor(pointer.left);
                pointer.val = predecessorNode.val;
                pointer.left = delete(pointer.left, predecessorNode.val);

            } else {
                Node successorNode = inOrderSuccessor(pointer.right);
                pointer.val = successorNode.val;
                pointer.right = delete(pointer.right, successorNode.val);
            }
        }

        return pointer;
    }

    public int height(Node root) {
        if (root == null) {
            return 0;
        }
        int left = height(root.left);
        int right = height(root.right);
        return Math.max(left, right) + 1;
    }

    public Node inOrderPredecessor(Node node) {
        if (node == null) {
            return null;
        }
        if (node.right == null) {
            return node;
        }
        return inOrderPredecessor(node.right);

    }

    public Node inOrderSuccessor(Node node) {
        if (node == null) {
            return null;
        }
        if (node.left == null) {

            return node;
        }
        return inOrderSuccessor(node.left);
    }
}
