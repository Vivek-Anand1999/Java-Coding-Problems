package DSATree.avl;


public class AllRotateOperation {
    public static void main(String[] args) {
        Operations op = new Operations();
        op.head = op.createAvlTree(op.head, 30);
        op.head = op.createAvlTree(op.head, 20);
        op.head = op.createAvlTree(op.head, 10);
        inOrder(op.head);

    }

    public static void inOrder(Node1 root) {
        if (root == null) {
            return;
        } else {
            inOrder(root.left);
            System.out.print(root.val + " ");
            inOrder(root.right);
        }
    }
}

class Operations {
    public Node1 head;

    public Node1 createAvlTree(Node1 root, int key) {
        if (root == null) {
            root = new Node1(key);
            root.height = 1;
            return root;
        }
        if (key > root.val) {
            root.right = createAvlTree(root.right, key);
        } else if (key < root.val) {
            root.left = createAvlTree(root.left, key);
        } else {
            System.out.println("duplicate key found");
            return root;
        }

        root.height = height(root);

        if (balanceFactor(root) == 2 && balanceFactor(root.left) == 1) {
            return llRotation(root);
        } else if (balanceFactor(root) == -2 && balanceFactor(root.right) == -1) {
            return rrRotation(root);
        } else if (balanceFactor(root) == -2 && balanceFactor(root.right) == 1) {
            return rlRotation(root);
        } else if (balanceFactor(root) == 2 && balanceFactor(root.left) == -1) {
            return lrRotation(root);
        }
        return root;
    }

    private Node1 lrRotation(Node1 root) {
        if (root == null) {
            return null;
        }
        root.left = rrRotation(root.left);
        return llRotation(root);
    }

    private Node1 rlRotation(Node1 root) {
        if (root == null) {
            return null;
        }
        root.right = llRotation(root.right);
        return rrRotation(root);
    }

    private Node1 rrRotation(Node1 root) {
        if (root == null) {
            return null;
        }
        Node1 pointer = root.right;
        root.right = pointer.left;
        pointer.left = root;
        root.height = height(root);
        pointer.height = height(pointer);
        return pointer;
    }

    private Node1 llRotation(Node1 root) {
        if (root == null) {
            return null;
        }
        Node1 pointer = root.left;
        root.left = pointer.right;
        pointer.right = root;
        root.height = height(root);
        pointer.height = height(pointer);
        return pointer;
    }

    // Finding the balance factor hl-hr
    public int balanceFactor(Node1 root) {
        int left = root != null && root.left != null ? root.left.height : 0;
        int right = root != null && root.right != null ? root.right.height : 0;
        return left - right;
    }

    public int height(Node1 root) {
        int left = root != null && root.left != null ? root.left.height : 0;
        int right = root != null && root.right != null ? root.right.height : 0;
        return Math.max(left, right) + 1;
    }

}

class Node1 {
    public int val;
    public Node1 left;
    public Node1 right;
    public int height;

    public Node1(int val) {
        this.val = val;
    }
}