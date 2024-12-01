package DSATree.CeatingTree;

import java.util.HashMap;
import java.util.Map;

public class PostOrder {
    public void recursionHelper(int[] postOrder, int[] inOrder) {
        Map<Integer, Integer> inOrderHash = new HashMap<>();
        for (int index = 0; index < inOrder.length; index++) {
            inOrderHash.put(inOrder[index], index);
        }
        ListNode root = creatingTree(postOrder, 0, postOrder.length - 1, inOrder, 0, inOrder.length - 1, inOrderHash);
    }

    private ListNode creatingTree(int[] preOrder, int postStart, int postEnd, int[] inOrder, int inStart, int inEnd, Map<Integer, Integer> inOrderHash) {
        if (postStart > postEnd || inStart > inEnd) {
            return null;
        }

        int rootValue = preOrder[postEnd];
        ListNode root = new ListNode(rootValue);
        int rootIndex = inOrderHash.get(rootValue);
        int leftSideValue = rootIndex - inStart;

        root.left = creatingTree(preOrder, postStart, postStart + leftSideValue - 1, inOrder, inStart, rootIndex - 1, inOrderHash);
        root.right = creatingTree(preOrder, postStart + leftSideValue, postEnd - 1, inOrder, rootIndex + 1, inEnd, inOrderHash);
        return root;
    }
}

class ListNode1 {
    public int val;
    public ListNode1 left;
    public ListNode1 right;

    public ListNode1(int val) {
        this.val = val;
    }
}


class Main1 {
    public static void main(String[] args) {
        int[] inOrder = {40, 20, 50, 10, 60, 30};
        int[] postOrder = {40, 50, 20, 60, 30, 10};
        PostOrder postOrder1 = new PostOrder();
        postOrder1.recursionHelper(postOrder, inOrder);
    }
}