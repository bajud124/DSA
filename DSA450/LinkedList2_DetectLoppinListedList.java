// https://practice.geeksforgeeks.org/problems/detect-loop-in-linked-list/1
package DSA450;

public class LinkedList2_DetectLoppinListedList {
    public static boolean detectLoop(Node head){
        Node s = head;
        Node d = head; 
        while(d != null && d.next != null && d.next.next != null) {
            s = s.next;
            d = d.next.next;
            if (s == d) {
                return true;
            }
        }
        return false;
    }
}

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}
