package DataStructureAlgorith.SinglyLinked;

public class SinglyLinked {
    public Node head;
    public Node tail;
    public int size = 0;

    public void createNode(int value) {
        if (head == null) {
            System.out.println("List is empty becz head = " + " " + head);
            Node newNode = new Node();
            head = newNode;
            newNode.data = value;
            newNode.next = null;
            tail = newNode;
            size++;
        } else {
            createNodeAtLast(value);
        }
    }

    private void createNodeAtLast(int value) {
        Node newNode = new Node();
        newNode.data = value;
        newNode.next = null;
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    public void addAtLast(int value) {
        if (tail == null) {
            Node newNode = new Node();
            System.out.println("NO node exists");
            newNode.data = value;
            newNode.next = null;
            head = newNode;
            tail = newNode;
            size++;
        } else {
            createNodeAtLast(value);
        }
    }

    public void addAtFirst(int value) {
        if (head == null) {
            Node newNode = new Node();
            head = newNode;
            newNode.data = value;
            newNode.next = null;
            tail = newNode;
            size++;
        } else {
            Node newNode = new Node();
            newNode.data = value;
            newNode.next = head;
            head = newNode;
            size++;
        }
    }

    public void printLinkedList() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + "->");
            currentNode = currentNode.next;
        }
        System.out.println("null");
        System.out.println("Size of linked list is = " + size);
    }
}
