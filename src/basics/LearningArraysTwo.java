package basics;

import java.util.Scanner;

public class LearningArraysTwo {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        int n = s.nextInt();
//        int[] marks = new int[n];
//
//        for (int i = 0; i < marks.length; i++) {
////            System.out.print(marks[i] + " ");
//            marks[i] = 200 + (i * 10);
//        }
//
//        System.out.println("\n Reference value of the Array: " + marks);
//
//        System.out.println("Populating the array!");
//        for (int i = 0; i < marks.length; i++) {
//            System.out.print(marks[i] + " ");
//        }
//
////        200  210  220  230  240  250  260  270  280  290
////         0    1    2    3    4    5    6    7    8    9
//
//
//        int[] temp = marks;
//        temp[6] = 500;
//        System.out.println("\n\n");
//
//        System.out.println("Updated array elements!");
//        for (int i = 0; i < marks.length; i++) {
//            System.out.print(marks[i] + " ");
//        }
//
//        System.out.println("\n\n -------------------------------------------------- \n");
//
//        System.out.println("Enter the total number of students: ");
//        n = s.nextInt();
//        int[] students = new int[n];
//
//        System.out.println("Enter the marks: ");
//        for (int i = 0; i < students.length; i++) {
//            students[i] = s.nextInt();
//        }
//
//        System.out.println("Doing the Science! Hold it!");
//
//
//        int totalMarks = 0;
//
//        for (int i = 0; i < students.length; i++) {
//            totalMarks += students[i];
//        }
//
//        double avgMarks = (double)totalMarks / n;
//
//        System.out.println("Average marks: " + avgMarks);



        // Searching Algorithms
        // 1. Linear Search
        int n = s.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        int x = s.nextInt();
        boolean flag = false; int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                index = i;
                flag = true;
                break;
            }
        }

        if (flag) {
            System.out.println("Found at: " + index);
        } else {
            System.out.println("Didnt find! " + index);
        }

    }
}
