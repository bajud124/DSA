// https://practice.geeksforgeeks.org/problems/remove-duplicate-element-from-sorted-linked-list/1
package DSA450;

public class LinkedList5_RemoveDuplicateInSorted {
    Node removeDuplicates(Node head) {
        Node res = head;
        while (head.next != null) {
            if (head.data == head.next.data) {
                head.next = head.next.next;
            } else {
                head = head.next;
            }
        }
        return res;
    }

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }
}
