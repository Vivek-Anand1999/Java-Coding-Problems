package DSATree.CeatingTree;

import java.util.HashMap;
import java.util.Map;


public class PreOrder {

    public void recursionHelper(int[] preOrder, int[] inOrder) {
        Map<Integer, Integer> inOrderHash = new HashMap<>();
        for (int index = 0; index < inOrder.length; index++) {
            inOrderHash.put(inOrder[index], index);
        }
        ListNode root = creatingTree(preOrder, 0, preOrder.length - 1, inOrder, 0, inOrder.length - 1, inOrderHash);
    }

    private ListNode creatingTree(int[] preOrder, int preStart, int preEnd, int[] inOrder, int inStart, int inEnd, Map<Integer, Integer> inOrderHash) {
        if (preStart > preEnd || inStart > inEnd) {
            return null;
        }

        int rootValue = preOrder[preStart];
        ListNode root = new ListNode(rootValue);
        int rootIndex = inOrderHash.get(rootValue);
        int leftSideValue = rootIndex - inStart;

        root.left = creatingTree(preOrder, preStart + 1, preStart + leftSideValue, inOrder, inStart, rootIndex - 1, inOrderHash); //calling 7
        root.right = creatingTree(preOrder, preStart + leftSideValue + 1, preEnd, inOrder, rootIndex + 1, inEnd, inOrderHash);
        return root;
    }

}

class Main {
    public static void main(String[] args) {

        int preOrder[] = {4, 7, 9, 6, 3, 2, 5, 8, 1};
        int inOrder[] = {7, 6, 9, 3, 4, 5, 8, 2, 1};

        PreOrder preOrder1 = new PreOrder();
        preOrder1.recursionHelper(preOrder, inOrder);
    }
}

class ListNode {
    public int val;
    public ListNode left;
    public ListNode right;

    public ListNode(int val) {
        this.val = val;
    }
}