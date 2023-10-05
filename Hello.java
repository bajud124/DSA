
// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

import DSA450.Array0_ReverseTheArray;
import DSA450.SearchSort0_FirstLastOccurrences;

class Hello {
    static Node head; // head of list

	static class Node {
		int data;
		Node next;
		Node(int d)
		{
			data = d;
			next = null;
		}
	}

	static Node reverse(Node head)
	{
		if (head == null || head.next == null)
			return head;

		/* reverse the rest list and put
		the first element at the end */
		Node rest = reverse(head.next);
		head.next.next = head;

		/* tricky step -- see the diagram */
		head.next = null;

		/* fix the head pointer */
		return rest;
	}

	/* Function to print linked list */
	static void print()
	{
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	static void push(int data)
	{
		Node temp = new Node(data);
		temp.next = head;
		head = temp;
	}

	/* Driver program to test above function*/
	public static void main(String args[])
	{
		/* Start with the empty list */

		push(20);
		//push(4);
		//push(15);
		//push(85);

		System.out.println("Given linked list");
		print();

		head = reverse(head);

		System.out.println("Reversed linked list");
		print();
	}
}

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (k == 1) {
            return nums;
        }
        int[] res = new int[nums.length - k + 1];
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        dq.offerFirst(nums[0]);
        for (int i = 1; i < k; i++) {
            if (dq.peekLast() <= nums[i]) {
                if (dq.peekLast() < nums[i])
                    dq.pollLast();
                dq.offerLast(nums[i]);
            } else {
                dq.offerLast(nums[i]);
            }
        }
        int i = 0;
        res[i++] = dq.peekFirst();
        for (int l = 0, r = k; r < nums.length; l++, r++) {
            if (dq.peekFirst() == nums[l]) {
                dq.pollFirst();
            }
            while (!dq.isEmpty() && dq.peekLast() < nums[r]) {
                dq.pollLast();
            }
            dq.offerLast(nums[r]);
            res[i++] = dq.peekFirst();
        }
        return res;
    }
}