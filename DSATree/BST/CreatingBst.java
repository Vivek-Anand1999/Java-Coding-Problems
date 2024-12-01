package DSATree.BST;

import DSATree.Node;

import java.util.Arrays;

public class CreatingBst {
    public Node root;
    int[] keys = {9, 15, 5, 20, 16, 8, 12, 3, 6};

    public void helper(int[] keys) {
        Arrays.sort(keys); //{3,5,6,8,9,12,15,16,20}
        Node creatingTree = creatingTree(keys, 0, keys.length - 1);
        root = creatingTree;
    }

    //creatingTree
    public Node creatingTree(int[] keys, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        Node root = new Node(keys[mid]);
        root.left = creatingTree(keys, start, mid - 1);
        root.right = creatingTree(keys, mid + 1, end);
        return root;
    }

}

