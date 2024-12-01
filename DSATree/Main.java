package DSATree;

public class Main {
    /*
    *               30
    *             /    \
    *            15     50
    *           /  \   /  \
    *          10  20 40  60
    *
    * */

    public static void main(String[] args) {
        TreeTraversal treeTraversal = new TreeTraversal();
        treeTraversal.root = new Node(30);
        treeTraversal.root.left = new Node(15);
        treeTraversal.root.left.left = new Node(10);
        treeTraversal.root.left.right = new Node(20);
        treeTraversal.root.right = new Node(50);
        treeTraversal.root.right.left = new Node(40);
        treeTraversal.root.right.right = new Node(60);
        System.out.println("Pre order traversal of binary tree: ");
        treeTraversal.preOrder(treeTraversal.root);
        System.out.println("\nPost order traversal of binary tree: ");
        treeTraversal.postOrder(treeTraversal.root);
        System.out.println("\nIn order traversal of binary tree:");
        treeTraversal.inOrder(treeTraversal.root);
        int levelHeight = treeTraversal.levelHeights(treeTraversal.root);
        System.out.println("\nfinding level of tree: " + levelHeight);
        System.out.println("level order traversal of binary tree:");
        treeTraversal.recursionHelper();

        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@");
        int countNode = treeTraversal.countNode(treeTraversal.root);
        int totalHeight = treeTraversal.countHeight(treeTraversal.root);
        System.out.println("Total number of node : "+ countNode);

        System.out.println("Total number of height : "+ totalHeight);
        System.out.println("total leafNode is " + treeTraversal.countingLeafNode(treeTraversal.root) );
        System.out.println("total non-leaf node " + treeTraversal.countingNonLeafNode(treeTraversal.root));

        System.out.println("\n*****************************************");

        IterativeWay iterativeWay = new IterativeWay();

        iterativeWay.root = new Node(30);
        iterativeWay.root.left = new Node(15);
        iterativeWay.root.left.left = new Node(10);
        iterativeWay.root.left.right = new Node(20);
        iterativeWay.root.right = new Node(50);
        iterativeWay.root.right.left = new Node(40);
        iterativeWay.root.right.right = new Node(60);

        System.out.println("Pre order traversal of binary tree: ");
        iterativeWay.preOrder();
        System.out.println("\nPost order traversal of binary tree: ");
        iterativeWay.postOrder();
        System.out.println("\nIn order traversal of binary tree:");
        iterativeWay.inOrder();
        System.out.println();
        System.out.println("level order traversal of binary tree:");
        iterativeWay.levelOrder();
    }

}
