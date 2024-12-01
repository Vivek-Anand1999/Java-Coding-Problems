package DSATree.BST;

import DSATree.Node;

import java.util.Arrays;
import java.util.Stack;

public class PreOrderCreate {
    public Node root;
    int[] preorder = {30, 20, 10, 15, 25, 40, 50, 45};
    private int index = 0;

    public void creatingTree(int[] preorder) {
        int index = 0;
        root = new Node(preorder[index++]);
        Node pointer = root;
        Stack<Node> nodeAddress = new Stack<>();

        while (index < preorder.length) {

            if (preorder[index] < pointer.val) {
                Node temp = new Node(preorder[index++]);
                pointer.left = temp;
                nodeAddress.push(pointer);
                pointer = temp;
            } else {
                int right = !nodeAddress.isEmpty() ? nodeAddress.peek().val : Integer.MAX_VALUE;
                if (preorder[index] > pointer.val && preorder[index] < right) {
                    Node temp = new Node(preorder[index++]);
                    pointer.right = temp;
                    pointer = temp;
                } else {
                    pointer = nodeAddress.pop();
                }
            }
        }
    }

    // if you want to do this using recursion

    public Node helper(int[] preorder) {
        Arrays.sort(preorder); // 10,15,20,25,30,40,45,50
        return construct(preorder, 0, preorder.length - 1);
    }

    public Node construct(int[] preorder, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        Node pointer = new Node(preorder[mid]);
        pointer.left = construct(preorder, start, mid - 1);
        pointer.right = construct(preorder, mid + 1, end);
        return pointer;
    }

    public Node recursionHelper(int[] preorder) {
        if (index > preorder.length) {
            return null;
        }
        root = new Node(preorder[index]); // 30, 20, 10, 15, 25, 40, 50, 45
        index++;
        Stack<Node> stack1 = new Stack<>();
        create(preorder, stack1, root);
        return root;
    }

    private Node create(int[] preorder, Stack<Node> stack1, Node root) {
        if (index > preorder.length - 1) {
            return root;
        }
        int nodeVal = preorder[index]; //20
        Node temp = new Node(nodeVal);

        if (nodeVal < root.val) {
            root.left = temp;
            index++;
            stack1.push(root);
            create(preorder, stack1, temp);
        } else {
            while (!stack1.isEmpty() && stack1.peek().val < nodeVal) {
                root = stack1.pop();
            }
            root.right = temp;
            index++;
            create(preorder, stack1, temp);
        }
        return root;

    }
}

class Test {
    public static void main(String[] args) {
        PreOrderCreate p = new PreOrderCreate();
        p.recursionHelper(p.preorder);
    }
}