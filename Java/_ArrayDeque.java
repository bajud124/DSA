package Java;

import java.util.ArrayDeque;

public class _ArrayDeque {
    public static void main(String[] args) {
        /**
         * Dubuly ended queue
         */
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<Integer>();

        // Offer and offerFirst would be same 
        /**
         * This will add element at tail side of Queue
         */
        arrayDeque.offer(4);

        /**
         * This will add element at head side of Queue
         */
        arrayDeque.offerFirst(5);

        /**
         * This will add element at tail side to Queue
         */
        arrayDeque.offerLast(3);

        // Peek and peekFirst would be same 
        /**
         * This will reutrn haed element of Queue
         * same as offer
         */
        arrayDeque.peek();
        arrayDeque.peekFirst();
        arrayDeque.peekLast();

        // poll ans pollFirst would be same
        /**
         * same as offer
         * This will reutrn and remove head element of Queue
         */
        arrayDeque.poll();
        arrayDeque.pollFirst();
        arrayDeque.pollLast();
    } 
}
