// https://practice.geeksforgeeks.org/problems/remove-loop-in-linked-list/1
package DSA450;

public class LinkedList3_RemoveLoop {
    public static void removeLoop(Node head){
        Node s = head;
        Node d = head; 
        // find loop in linked list
        while(d != null && d.next != null) {
            s = s.next;
            d = d.next.next;
            if (s == d) {
                break;
            }
        }
        // if index touch to end mean no loop in linked list
        if (s != d){
            return;
        }

        Node check = d;
        // if loop is present at head of linked list then remove loop
        while(head == d) {
            if(check.next == head) {
                check.next = null;
                return;
            }
            check = check.next;
        }
        s = head;
        // remove loop from in between of linked list 
        while (s.next != d.next) {
            s = s.next;
            d = d.next;
        }
        d.next = null;
    }
}

class Node
{
    int data;
    Node next;
}