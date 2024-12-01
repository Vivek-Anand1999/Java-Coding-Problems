package DSATree.TreeTraversalUnique;

import java.util.HashMap;
import java.util.Map;

class Main {
    static String x = "sdrfcgvhbjndfffxcfvgbh1554553";

    public void recursionHelper(int[] preOrder, int[] inOrder, Map<Integer, Integer> inOrderMap) {
        TreeNode root = constructTree(preOrder, 0, preOrder.length - 1, inOrder, 0, inOrder.length - 1, inOrderMap);
        inOrder(root);
    }

    public TreeNode constructTree(int[] preOrder, int preStart, int preEnd, int[] inOrder, int inStart, int inEnd, Map<Integer, Integer> inMap) {
        if (preStart > preEnd || inStart > inEnd) {
            return null;
        }
        int rootValue = preOrder[preStart];
        TreeNode root = new TreeNode(rootValue);
        int rootIndex = inMap.get(rootValue);
        int numLeft = rootIndex - inStart;
        root.left = constructTree(preOrder, preStart + 1, preEnd, inOrder, inStart, rootIndex - 1, inMap);
        root.right = constructTree(preOrder, preStart + numLeft + 1, preEnd, inOrder, rootIndex + 1, inEnd, inMap);
        return root;
    }

    public void inOrder(TreeNode root) {
        if (root == null) {
            return;
        } else {
            inOrder(root.left);
            System.out.print(root.val + " ");
            inOrder(root.right);
        }
    }

}


public class Pre_In_Order {
    public static void main(String[] args) {
        int[] inOrder = {30, 20, 10, 40, 50};
        int[] postOrder = {30, 20, 50, 40, 10};
        int[] rev = {10, 40, 50, 20, 30};
        int[] preOrder = {10, 20, 30, 40, 50};

        Map<Integer, Integer> inOrderIndex = new HashMap<>();

        for (int index = 0; index < inOrder.length; index++) {
            inOrderIndex.put(inOrder[index], index);
        }
        Main main = new Main();
        main.recursionHelper(preOrder, inOrder, inOrderIndex);
    }
}

class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}

class PostOrder {
    public static void main(String[] args) {
        int[] inOrder = {40, 20, 50, 10, 60, 30};
        int[] postOrder = {40, 50, 20, 60, 30, 10};
        Map<Integer, Integer> inOrderIndex = new HashMap<>();

        for (int index = 0; index < inOrder.length; index++) {
            inOrderIndex.put(inOrder[index], index);
        }
        recursionHelper(postOrder, inOrder, inOrderIndex);
    }

    public static void recursionHelper(int[] postOrder, int[] inOrder, Map<Integer, Integer> inMap) {
        TreeNode node = createTree(postOrder, 0, postOrder.length - 1, inOrder, 0, inOrder.length - 1, inMap);
        Main main = new Main();
        main.inOrder(node);

    }

    public static TreeNode createTree(int[] postOrder, int postStart, int postEnd, int[] inOrder, int inStart, int inEnd, Map<Integer, Integer> inMap) {
        if (postStart > postEnd || inStart > inEnd) {
            return null;
        }
        int rootValue = postOrder[postEnd];
        TreeNode rootNode = new TreeNode(rootValue);
        int rootIndex = inMap.get(rootValue);
        int leftDigit = rootIndex - inStart;
        rootNode.left = createTree(postOrder, postStart, postStart + leftDigit - 1, inOrder, inStart, rootIndex - 1, inMap);
        rootNode.right = createTree(postOrder, postStart + leftDigit, postEnd - 1, inOrder, rootIndex + 1, inEnd, inMap);
        return rootNode;
    }
}