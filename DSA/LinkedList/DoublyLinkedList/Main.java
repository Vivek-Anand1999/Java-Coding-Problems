package DSA.LinkedList.DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.createNode(2);
        doublyLinkedList.addFirst(1);
        doublyLinkedList.addLast(4);
        doublyLinkedList.addAtPosition(3,3);
        doublyLinkedList.print();
    }
}
