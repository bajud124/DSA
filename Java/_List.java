package Java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _List {
    public static void main(String[] args) {
        // declare int array with size 10
        int marks[] = new int[10];
        // assign value to 0th index
        marks[0] = 23;

        // declare int array with value
        int marks1[] = { 23, 45, 67, 89, 90 };
        System.out.println(marks1[0]);

        // string array give error of index out of bounds
        /**
         * array list will not give error of index out of bounds
         * if it will be declared with size and you try to insert value of more than
         * index
         * it will allow to insert value of index
         *
         */
        String[] studentNameArray = new String[5];
        /**
         * If we have decalre array list with size N then we can insert value of index
         * upto N-1
         * but try to insert value of index N it will increse size with N/2 + 1 so new
         * array list size is N + N/2 + 1
         * and old array copy to new array and old arraylist will be dumped
         */
        ArrayList<String> studentsNameList = new ArrayList<String>(50);

        // functions of arraylist
        List<Integer> newList = new ArrayList<Integer>();
        List<Integer> list = new ArrayList<Integer>();
        // add value to list
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(1, 5);
        list.add(30);

        newList.addAll(list); // This will add all the value of list to newList

        /**
         * add value to the list at last index
         */
        list.add(4);

        /**
         * add value to given index to the list
         * with time complexity O(n)
         */
        list.add(3, 50);

        /**
         * Get value of given index from the list
         * with time complexity O(1)
         */
        int value = list.get(0);

        /**
         * This will remove 0th index element from List
         * Time complexity of remove is O(n)
         */
        list.remove(0);

        /**
         * This will remove value 30 from the list
         * Time complexity of remove is O(n)
         */
        list.remove(Integer.valueOf(30));

        /**
         * This will remove all element from the list
         */
        list.clear();

        /**
         * Update value of index 1 to 50 in the list
         * with time complexity of O(1)
         */
        list.set(1, 50);

        /**
         * this will return true if list contains value 50
         * with time complexity of O(n)
         */
        list.contains(50);

        // Type of itreration

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for (Integer element : list) {
            System.out.println(element);
        }

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
