package DSA.LinkedList.DoublyLinkedList;

public class DoublyLinkedList {
    private Node head;
    private int size = 0;

    // Create a Node
    public void createNode(int val) {
        if (head == null) {
            Node tempNode = new Node();
            tempNode.val = val;
            tempNode.prev = null;
            tempNode.next = null;
            head = tempNode;
            size++;
        } else {
            System.out.println("Head already created please check");
        }
    }

    // Adda at first
    public void addFirst(int val) {
        if (head == null) {
            createNode(val);
        } else {
            Node tempNode = new Node();
            tempNode.val = val;
            tempNode.prev = null;
            tempNode.next = head;
            head.prev = tempNode;
            head = tempNode;
            size++;
        }
    }

    //Add at last
    public void addLast(int val) {
        if (head == null) {
            createNode(val);
        } else {
            Node tempNode = new Node();
            tempNode.val = val;
            tempNode.next = null;
            Node pointer = head;
            while (pointer.next != null) {
                pointer = pointer.next;
            }
            tempNode.prev = pointer;
            pointer.next = tempNode;
            size++;
        }
    }

    // Traversing
    public void print() {
        if (head == null) {
            System.out.println("There is no node initialize still");
        } else {
            Node pointer = head;
            while (pointer != null) {
                System.out.print(pointer.val);
                System.out.print(" -> ");
                pointer = pointer.next;
            }
            System.out.println("null");
        }
        System.out.println("LinkedList size: " + size);
    }

    // Add in between
    public void addAtPosition(int val, int pos) {
        if (head == null || pos > size) {
            String result = head == null ? "head is null" : "pos is exceed the size";
            System.out.println(result);
        } else {
            int count = 0;
            Node pointer = head;
            Node follower = null;
            Node tempNode = new Node();
            tempNode.val = val;
            while (pointer != null) {
                count++;
                if (pos == count) {
                    tempNode.prev = follower;
                    tempNode.next = pointer;
                    follower.next = tempNode;
                    pointer.prev = tempNode;
                    return;
                } else {
                    follower = pointer;
                    pointer = pointer.next;
                }
            }
        }
    }
}
