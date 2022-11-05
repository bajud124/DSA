package Java;

import java.util.Comparator;
import java.util.PriorityQueue;

public class _PriorityQueue {
    public static void main(String[] args) {

        /**
         * This priority queue head has minimum value
         */
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        /**
         * This priority queue head has maximum value
         */
        PriorityQueue<Integer> rpq = new PriorityQueue<Integer>(Comparator.reverseOrder());


        /** 
         * This will add element to the PriorityQueue 
         * This will reutrn true or false */
        pq.offer(12);
        pq.offer(10);
        pq.offer(11);
        pq.offer(14);

        System.out.println(pq);
        /** 
         * This will Return and remove high priority element from the PriorityQueue
         */
        pq.poll();

        /**
         * This will return high priority element from the PriorityQueue
         */
        pq.peek();
    }
}
