// https://practice.geeksforgeeks.org/problems/reverse-a-linked-list-in-groups-of-given-size/1
package DSA450;

public class LinkedList1_ReverseAlinkedListofGivenSize {
    public Node reverse(Node node, int k)
    {
        if (node == null) 
            return null; 
        Node next = null;
        Node prev = null;
        Node curr = node;
        int count = 0;
        while (curr != null && count < k) {
            next = curr.next; 
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }
        if (next != null) {
            node.next = reverse(next, k);
        }
        return prev;
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
