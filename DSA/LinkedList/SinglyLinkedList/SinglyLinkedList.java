package DSA.LinkedList.SinglyLinkedList;

public class SinglyLinkedList {
    private Node head;
    private int size = 0;

    // Create Node
    public void createNode(int val) {
        if (head == null) {
            Node tempNode = new Node();
            tempNode.val = val;
            tempNode.next = null;
            head = tempNode;
            size++;
        } else {
            System.out.println("Head already initialize please use other methods :)");
        }
    }

    // Add Node at first
    public void addFirst(int val) {
        if (head == null) {
            createNode(val);
        } else {
            Node tempNode = new Node();
            tempNode.val = val;
            tempNode.next = head;
            head = tempNode;
            size++;
        }
    }

    //Add Node at last
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
            pointer.next = tempNode;
            size++;
        }
    }

    // Traverse the Node
    public void print() {
        if (head == null) {
            System.out.println("null");
        } else {
            Node pointer = head;
            while (pointer != null) {
                System.out.print(pointer.val);
                pointer = pointer.next;
                System.out.print(" -> ");
            }
            System.out.println("null");
        }
        System.out.println("Size of LinkedList is: " + size);
    }

    // Add in between position
    public void addAtPosition(int val, int pos) {
        if (pos > size || head == null) {
            String result = head == null ? "Head is null" : "Pos exceed with the current size";
            System.out.println(result);
        } else {
            Node pointer = head;
            Node follower = null;
            int count = 0;
            while (pointer != null) {
                count++;
                if (count == pos) {
                    Node tempNode = new Node();
                    tempNode.val = val;
                    tempNode.next = pointer;
                    follower.next = tempNode;
                    return;
                }
                follower = pointer;
                pointer = pointer.next;
            }
        }
    }

    public Node swap() {
        Node f = head;
        Node p = head.next;
        Node dummy = null;
        Node d = null;
        if(head != null && head.next == null){
            return head;
        }
        while (f.next != null && f.next != null) {
            if (dummy == null) {
                dummy = new Node(p.val);
                d = dummy;
            } else {
                d.next = new Node(p.val);
                d = d.next;
            }
            d.next = new Node(f.val);
            d = d.next;
            f = f.next.next;
            p = p.next.next;
        }
        if (f != null) {
            d.next = new Node(f.val);
        }else{
            d = d.next;
            d.next = new Node(p.val);
        }
        head =dummy;
        return head;
    }
}

