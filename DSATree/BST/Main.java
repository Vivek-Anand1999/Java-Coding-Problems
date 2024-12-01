package DSATree.BST;

import DSATree.Node;
import util.Utility;

public class Main {
    public static void main(String[] args) {

        Searching searching = new Searching();

        searching.root = new Node(30);
        //left squeezed
        searching.root.left = new Node(20);
        searching.root.left.left = new Node(10);
        searching.root.left.right = new Node(25);

        //right squeezed
        searching.root.right = new Node(40);
        searching.root.right.left = new Node(35);
        searching.root.right.right = new Node(50);

        Inserting inserting = new Inserting();
        inserting.root = searching.root;
//        Utility.inOrder(inserting.root);
        inserting.insertRecursively(inserting.root, 38);
//        Utility.inOrder(inserting.root);

        CreatingBst creatingBst = new CreatingBst();
        creatingBst.helper(creatingBst.keys);
//        Utility.inOrder(creatingBst.root);

        DeletingNode deletingNode = new DeletingNode();
        deletingNode.root = creatingBst.root;
//        Utility.inOrder(deletingNode.root);
        Node delete = deletingNode.delete(deletingNode.root, 9);
        System.out.println(delete.val);
        Utility.inOrder(deletingNode.root);

//        PreOrderCreate preOrderCreate = new PreOrderCreate();
//        preOrderCreate.creatingTree(preOrderCreate.preorder);
//        System.out.println(preOrderCreate.root);
//        Utility.inOrder(preOrderCreate.root);
//        Node temp = preOrderCreate.helper(preOrderCreate.preorder);
//        System.out.println();
//        Utility.inOrder(temp);
//
//        preOrderCreate.recursionHelper(preOrderCreate.preorder);


    }
}
