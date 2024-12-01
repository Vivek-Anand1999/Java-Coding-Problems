package DSA.LinkedList.SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.createNode(1);
        singlyLinkedList.addLast(2);
        singlyLinkedList.addLast(3);
        singlyLinkedList.addLast(4);


        singlyLinkedList.swap();
        singlyLinkedList.print();
    }
}

