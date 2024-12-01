package amazoneProblems;

import java.util.ArrayList;
import java.util.List;

public class LeftViewTree {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        tree.root.left.right.right = new Node(8);
        List<Integer> result = new ArrayList<>();
        tree.leftView(tree.root, 1, result);
        System.out.println(result);
    }
}

class Tree {
    public Node root;

    int maxLevel = 0;

    public void leftView(Node root, int level, List<Integer> result) {
        if (root == null) {
            return;
        }
        if (maxLevel < level) {
            result.add(root.val);
            maxLevel = level;
        }
        leftView(root.left, level + 1, result);
        leftView(root.right, level + 1, result);
    }

}

class Node {
    public int val;
    public Node left;
    public Node right;

    public Node(int val) {
        this.val = val;
    }
}

/*
                     1
                   /   \
                  2     3
                 / \   / \
                4   5 6   7
                     \
                      8
 */