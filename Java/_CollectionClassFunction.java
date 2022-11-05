package Java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    String name;
    int age;
    int marks;

    public Student(String name, int age, int marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }
}

public class _CollectionClassFunction {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        /**
         * This will return minimum element from list
         */
        Collections.min(list);

        /**
         * This will return maximum element from list
         */
        Collections.max(list);

        /**
         * This will return count of given element from list
         */
        Collections.frequency(list, 2);

        /**
         * This will sort list in ascending order
         */
        Collections.sort(list);

        /**
         * This will sort list in descending order
         */
        Collections.sort(list, Comparator.reverseOrder());

        List<Student> list1 = new ArrayList<Student>();
        list1.add(new Student("A", 1, 4));
        list1.add(new Student("B", 2, 5));
        list1.add(new Student("C", 3, 1));

        Collections.sort(list1, new Comparator<Student>() {
            /**
             * Sort using students mark with asending order
             */
            @Override
            public int compare(Student o1, Student o2) {
                return o1.marks - o2.marks;
            }
        });

        System.out.println(list1.get(0).name);
        /**
         * Custom sort uding lamda expression
         */
        Collections.sort(list1, (o1, o2) -> o1.marks - o2.marks);
    }

}
