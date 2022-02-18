package basics;

import java.util.Scanner;

public class PatternOne {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

//        One Way to do it
        // Hard coding
//        System.out.println("*");
//        System.out.println("**");
//        System.out.println("***");
//        System.out.println("****");
//        System.out.println("*****");

//        Second way to do it
        // Hard Coding
//        System.out.println("*\n**\n***\n****\n*****");


        int nRows = s.nextInt(); // user input

        int currRow = 1; // row that I am generating
        System.out.println(currRow);

        while (currRow <= nRows) {
            // I am at the current row I am at


            /*
             *   1. Printing of stars for every row is dependent on the
             *      number of current row.
             *   2. Hence, we can't hard code the printing of stars.
             *   3. It is a repitive work.
             *
             * */

            int currCol = 1;
            while (currCol <= currRow) {
                System.out.print("*");
                currCol += 1;
            }

            System.out.println();
            currRow += 1;
        }

//        System.out.println(currRow); // n + 1 | n+1 <= n (last)
    }
}
