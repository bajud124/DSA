package Java;

import java.util.LinkedList;
import java.util.Queue;

public class _Queue {
    public static void main(String[] args) {
        /** Declare queue */
        Queue<Integer> queue = new LinkedList<Integer>();

        /** 
         * This will add element to the queue 
         * This will reutrn true or false */
        queue.offer(10);
        queue.offer(12);
        queue.offer(14);

        /**
         * This will add element to the queue
         * If fail to insert then it will throw exception
         */
        queue.add(16);

        
        /** 
         * This will Return and remove the head of the Queue
         * Return null if Queue is empty
         */
        queue.poll();

        /**
         * This will return and remove the head of the Queue
         * Throw exception if Queue is empty
         */
        queue.remove();

        /**
         * This will return head of the Queue
         * Return null if Queue is empty
         */
        queue.peek();

        /**
         * This will return the head of the Queue
         * Throw exception if Queue is empty
         */
        queue.element();
    }

}
