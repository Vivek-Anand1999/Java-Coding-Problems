package DSATree.avl;

public class GeneratingTree {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 25, 28, 27, 5};
        TreeGeneration treeGeneration = new TreeGeneration();
        Node helperNode = treeGeneration.helper(arr);
        treeGeneration.inOrder(helperNode);
    }
}

class TreeGeneration {
    public Node root;

    public Node helper(int[] arr) {
        for (int i : arr) {
            root = create(root, i);
        }
        return root;
    }

    public Node create(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            root.height = 1;
            return root;
        }
        if (key > root.val) {
            root.right = create(root.right, key);
        } else if (key < root.val) {
            root.left = create(root.left, key);
        } else {
            System.out.println("Duplicate key");
            return root;
        }
        root.height = nodeHeight(root);
        if (balanceFactor(root) == 2 && balanceFactor(root.left) == 1) {
            return llRotation(root);
        } else if (balanceFactor(root) == -2 && balanceFactor(root.right) == -1) {
            return rrRotation(root);
        } else if (balanceFactor(root) == 2 && balanceFactor(root.left) == -1) {
            return lrRotation(root);
        } else if (balanceFactor(root) == -2 && balanceFactor(root.right) == 1) {
            return rlRotation(root);
        }
        return root;
    }

    private Node rlRotation(Node node) {
        node.right = llRotation(node.right);
        return rrRotation(node.right);
    }

    private Node lrRotation(Node node) {
        node.left = rrRotation(node.left);
        return llRotation(node.left);
    }

    private Node rrRotation(Node node) {
        Node pointer = node.right;
        node.left = pointer.right;
        pointer.right = node;
        node.height = nodeHeight(node);
        pointer.height = nodeHeight(pointer);
        return pointer;
    }

    private Node llRotation(Node node) {
        Node pointer = node.left;
        node.left = pointer.right;
        pointer.right = node;
        node.height = nodeHeight(node);
        pointer.height = nodeHeight(pointer);
        return pointer;

    }

    private int balanceFactor(Node node) {
        int left = node != null && node.left != null ? node.height : 0;
        int right = node != null && node.right != null ? node.height : 0;
        return left - right;
    }

    public int nodeHeight(Node node) {
        int left = node != null && node.left != null ? node.left.height : 0;
        int right = node != null && node.right != null ? node.right.height : 0;
        return Math.max(left, right) + 1;
    }

    public void inOrder(Node root) {
        if (root == null) {
            return;
        } else {
            inOrder(root.left);
            System.out.print(root.val + " ");
            inOrder(root.right);
        }
    }
}

class Node {
    public int val;
    public Node left;
    public Node right;
    public int height;

    public Node(int val) {
        this.val = val;
    }
}