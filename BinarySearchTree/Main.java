package BinarySearchTree;


import BinarySearchTree.Searching.Searching;

public class Main {
    public static void main(String[] args) {
        Searching searching = new Searching();
        searching.root = new Node(30);
        searching.root.left = new Node(20);
        searching.root.left.left = new Node(10);
        searching.root.left.right = new Node(25);
        searching.root.right = new Node(40);
        searching.root.right.left = new Node(35);
        searching.root.right.right = new Node(50);
        searching.inOrder(searching.root);
        searching.searchingKey(searching.root,25);
    }
}
