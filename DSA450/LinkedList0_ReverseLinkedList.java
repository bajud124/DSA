// https://www.geeksforgeeks.org/reverse-a-linked-list/
package DSA450;

public class LinkedList0_ReverseLinkedList {
    static Node head;
 
    static class Node {
 
        int data;
        Node next;
 
        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    Node reverseIterative(Node node)
    {
        Node prev = null;
        Node curr = node;
        Node next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        node = prev;
        return node;
    }
}
