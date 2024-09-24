package LinkedList.SingleLinkedList;

public class SingleyLinkedList { // All operation are performed in this class
    public Node head;
    public Node Tail;
    public int size = 0;

    public void createSinglyLinkedLists(int nodeValue) { // create node first time.
        // head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        Tail = node;
        Tail.next = null;
        size++;
    }

    public void addNodeAtFirst(int nodeValue) { // add node at first
        Node newNode = new Node();
        if (head == null) {
            newNode.next = null;
            newNode.value = nodeValue;
            head = newNode;
            Tail = newNode;
        } else {
            newNode.value = nodeValue;
            newNode.next = head;
            head = newNode;
        }
        size++;

    }

    public void addLast(int nodeValue) { // add node at last
        Node newNode = new Node();
        newNode.value = nodeValue;
        Node currentNode = head;
        if (head == null) {
            newNode.value = nodeValue;
            head = newNode;
            Tail = newNode;
        }
        while (currentNode != null) {
            if (currentNode.next == null) {
                currentNode.next = newNode;
                newNode.next = null;
                Tail = newNode;
            }
            currentNode = currentNode.next;
        }
        size++;
    }

    public void addNodeBetweenTheNode(int nodeValue) { // adding node in between the linklist method 1
        Node newNode = new Node();
        Node currentNode = head;
        while (currentNode.next != null) {
            if (currentNode.value == nodeValue - 1) {
                newNode.value = nodeValue;
                newNode.next = currentNode.next;
                currentNode.next = newNode;
                size++;
            }
            currentNode = currentNode.next;
        }
    }

    public void addNodeAtSortedLinkedList(int nodeValue) {
        Node followingNode = null;
        Node currentNode = head;
        while (currentNode != null && currentNode.value < nodeValue) {
            followingNode = currentNode;
            currentNode = currentNode.next;
        }
        Node newNode = new Node();
        newNode.value = nodeValue;
        newNode.next = followingNode.next;
        followingNode.next = newNode;
        size++;

    }

    public void deleteNode(int deleteNodeData) {
        Node currentNode = head;
        if (head.value == deleteNodeData) {
            head = head.next;
            currentNode.next = null;
        } else {
            Node followingNode = null;
            while (currentNode != null) {
                if (currentNode.value != deleteNodeData) {
                    followingNode = currentNode;
                    currentNode = currentNode.next;
                } else {
                    followingNode.next = currentNode.next;
                    currentNode.next = null; // Grabge collection take care of this just just remove refference
                    break;
                }

            }
        }
        size--;

    }

    public void sortingLinkedList() {
        Node currNode = head;
        Node folowingNode = head.next;
        for (int i = 1; i <= size; i++) {
            if (currNode.next != null) {
                while (folowingNode != null) {
                    if (currNode.value < folowingNode.value) {
                        folowingNode = folowingNode.next;
                    } else {
                        int temp = folowingNode.value;
                        folowingNode.value = currNode.value;
                        currNode.value = temp;
                    }
                }
                currNode = currNode.next;
                folowingNode = currNode.next;
            } else {
                break;
            }

        }
    }

    public void printNode() { // printinglinkedlist
        if (head == null) {
            System.out.println("Linked list is empty");
        } else {
            Node currentNode = head;
            while (currentNode != null) {
                System.out.print(currentNode.value + "->");
                currentNode = currentNode.next;
            }
            System.out.println("null");
        }
        System.out.println("The size of the linked list is - " + size);
    }
}
