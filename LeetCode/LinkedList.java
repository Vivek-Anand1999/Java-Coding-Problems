package LeetCode;

import java.util.HashSet;
import java.util.Set;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    Node head;

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public Node removeElements(Node head, int val) {
        if (head == null) {
            return null;
        }
        while (head != null && head.data == val) {
            head = head.next;
        }
        Node pointer = head;
        Node follow = null;
        while (pointer != null) {
            if (pointer.data == val) {
                follow.next = pointer.next;
                Node temp = pointer;
                pointer = pointer.next;
                temp.next = null;


            } else {
                follow = pointer;
                pointer = pointer.next;

            }
        }
        return head;
    }

    public Node reverse(Node head) {
        Node dummy = null;
        while(head != null){
            Node temp = new Node(head.data);
            if(dummy == null){
                temp.next = null;
                dummy = temp;
            }else{
                temp.next = dummy;
                dummy = temp;
            }

            head = head.next;
        }
        return dummy;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Adding values to the linked list
        int[] values = {1, 2, 6, 3, 4, 5, 6};
        for (int value : values) {
            list.add(value);
        }
//        list.removeElements(list.head, 6);
        list.reverse(list.head);
        // Display the linked list
        list.display();
    }
}
