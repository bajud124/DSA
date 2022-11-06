// https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/
package LeetCode;

import Common.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class DeleteMiddleNodeOfLinkedList_2095 {

    // time complexity O(n)
    public ListNode deleteMiddle_method1(ListNode head) {
        ListNode root = new ListNode();
        root.next = head;
        ListNode result = root;
        boolean flag = false;
        // if flag true then we move root linkedlist head pointer to next node
        // also revert falg value
        // we have to follow this step until head become null
        while (head != null) {
            if (flag) {
                root = root.next;
            }
            flag = !flag;
            head = head.next;
        }
        // root head point to previous of middle node in linkedlist
        // delete next node(which is middle node in given linkedlist)
        root.next = root.next.next;
        return result.next;
    }

    // time complexity O(n/2)
    public ListNode deleteMiddle_method2(ListNode head) {

        // for single node in linkedlist
        if (head.next == null) {
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

        // we have even node in linked list then we move single_time linkedlist head to
        // next pointer
        if (double_times.next != null && double_times.next.next == null) {
            single_time = single_time.next;
        }

        // in single_time linked head pointer next node is middle node that we need to
        // delete
        // delete middle node
        single_time.next = single_time.next.next;
        return root;
    }
}
