package Java;

import java.util.Scanner;

public class BasicsOfJava {
    public static void main(String[] args) {
        // arithmatic opetaors
        // +, -, *, /, %, ++, --

        // Assignment Operators
        // =

        // bitwise operators
        // &, |, ^, ~, <<, >>

        // conditional operators
        // ==, !=, >, <, >=, <=

        // logical operators
        // &&, ||, !

        // ternary operator
        // ? :

        // Premitive data Type
        // byte, short, int, long, float, double, char, boolean

        // non premitive data tpyes
        // String, Object, Array

        try (// Taking user input
                Scanner sc = new Scanner(System.in)) {
            int age = sc.nextInt(); // taking input from user
            float salary = sc.nextFloat(); // taking input from user
            String name = sc.next(); // taking input from user

            System.out.println(salary);
            System.out.println(name);

            // Condition statement
            // if, else if, else
            if (age > 18) {
                System.out.println("You are eligible to vote");
            } else {
                System.out.println("You are not eligible to vote");
            }

            // looping statement
            // for, while, do while

            // infinite loop
            // for (;;) {
            // System.out.println("Hello");
            // }

            // for (initialization; condition; increment/decrement)
            for (int i = 0; i < 10; i++) {
                System.out.println("Hello");
                if (age > 18) {
                    break; // break statement to stop the loop
                }
                if (age < 18) {
                    continue; // continue statement to skip the current iteration
                }
            }

            // while (condition)
            while (true) {
                System.out.println("Hello");
                break;
            }

            // do while (condition)
            do {
                System.out.println("Hello");
            } while (age < 18);
        }
        
        // arrays
        // declare int array with size 10
        int marks[] = new int[10];
        // assign value to 0th index
        marks[0] = 23;

        // declare int array with value
        int marks1[] = { 23, 45, 67, 89, 90 };
        System.out.println(marks1[0]);

        // exceptional handling
        // try, catch, finally
        try {
            System.out.println("Hello");
        } catch (Exception e) {
            System.out.println("Exception");
        } finally {
            System.out.println("Finally");
        }
    }

    // methods
    // void, return type
    // void means no return type
    // access return_type methodName(parameter_list) {
    public int add(int a, int b) {
        return a + b;
    }
}