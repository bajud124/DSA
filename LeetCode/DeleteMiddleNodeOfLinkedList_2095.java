package LeetCode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class DeleteMiddleNodeOfLinkedList_2095 {
    public ListNode deleteMiddle(ListNode head) {
        
        // for single node in linkedlist
        if(head.next == null) {
            return null;
        }
        
        // for only two nodes in linkedlist
        if (head.next.next == null) {
            head.next = null;
            return head;
        }
        
        ListNode single_time = head;
        ListNode double_times = head;
        ListNode root = single_time;
        
        // first we move haed to double time in double_time linkedlist
        double_times = double_times.next.next;
        
        // untill we not get null value for double_times linkedList 
        // also move single_time linkedlist head pointer
        while (double_times.next != null && double_times.next.next != null) {
            double_times = double_times.next.next;
            single_time = single_time.next;
        }
        
        // we have even node in linked list then we move single_time linkedlist head to next pointer
        if (double_times.next != null && double_times.next.next == null) {
            single_time = single_time.next;
        }
        
        // in single_time linked head pointer next node is middle node that we need to delete 
        // delete middle node 
        single_time.next = single_time.next.next;
        return root;
    }
}
