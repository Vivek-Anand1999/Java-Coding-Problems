package DataStructureAlgorith.SinglyLinked;

public class Main {
    public static void main(String[] args) {
        SinglyLinked link = new SinglyLinked();
        // link.createNode(1);
        // link.createNode(2);
        // link.createNode(3);
        link.addAtLast(8);
        link.addAtLast(3);
        link.createNode(2);
        link.addAtFirst(1);
        link.printLinkedList();
    }
}
