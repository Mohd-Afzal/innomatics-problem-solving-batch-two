package basics;

import java.util.Scanner;

public class LearningArraysOne {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

//        // Marks in maths out of 100
//        int studentOne = s.nextInt();
//        int studentTwo = s.nextInt();
//        int studentThree = s.nextInt();
//        int studentFour = s.nextInt();
//        int studentFive = s.nextInt();
//
//        // Take the avg of the marks
//        double avgMarks = (studentOne + studentTwo + studentThree + studentFour + studentFive) / 5.0;
//
//        System.out.println(avgMarks);
//
//
//        studentOne += 5;
//        studentTwo += 5;


        // Creating an Array
//        int[] marks; // Declaration
//        marks = new int[10]; // Initialization

        int[] marks = new int[5];
        System.out.println(marks);

        int[] copy = marks;
        System.out.println(copy);

//        int val = marks[0];
//        marks[0] = 100;


        for (int i = 0; i < marks.length; i++) {
            marks[i] = 100 + i;
        }

        System.out.println();

        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }

    }

}
