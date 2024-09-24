package LinkedList.SingleLinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SingleyLinkedList list1 = new SingleyLinkedList();
        SingleyLinkedList list2 = new SingleyLinkedList();

        // ssl.createSinglyLinkedLists(2);
        // ssl.addNodeAtFirst(1);
        // ssl.addLast(55);
        // ssl.addLast(4);
        // ssl.addLast(6);
        // // ssl.addNodeAtSortedLinkedList(5);
        // ssl.addLast(39);
        // // ssl.addNodeAtSortedLinkedList(7);

        // // ssl.deleteNode(1);
        // ssl.sortingLinkedList();
        // ssl.printNode();

        // try {
        // System.out.println(ssl.head.toString());

        // } catch (Exception e) {
        // System.out.println("vivek " + e);
        // }

        list1.createSinglyLinkedLists(2);
        list1.addLast(3);
        list1.addLast(6);
        list1.addLast(3);

        list2.createSinglyLinkedLists(5);
        list2.addLast(6);
        list2.addLast(4);

        list1.printNode();
        System.out.println("------------------------");
        list2.printNode();

        List<Integer> x = new ArrayList<>();
        List<Integer> y = new ArrayList<>();

        Node currenNode = list1.head;
        Node currentNode2 = list2.head;
        int sum = 0;
        int quitent = 0;
        while (currenNode != null || currentNode2 != null) {
            if (currenNode != null && currentNode2 != null) {
                sum = quitent + (currenNode.value + currentNode2.value);
                if (sum > 9) {
                    int reminder = sum % 10;
                    quitent = sum / 10; // --> 1
                    y.add(reminder);
                } else {
                    y.add(sum);
                    quitent = 0;
                }
            }
            if (currenNode == null) {
                y.add(quitent + currentNode2.value);
            } else if (currentNode2 == null) {
                y.add(quitent + currenNode.value);
            }

            try {
                currenNode = currenNode.next;
                currentNode2 = currentNode2.next;
            } catch (Exception e) {
                System.err.println(e);
            }

        }
        Collections.reverse(y);
        System.out.println(y);

    }
}
