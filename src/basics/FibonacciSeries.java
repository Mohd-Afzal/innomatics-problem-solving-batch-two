package basics;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int nTerms = s.nextInt();

        int firstTerm = 0;
        int secondTerm = 1;
        System.out.print(firstTerm + " " + secondTerm + " ");

        int begin = 3;
        while (begin <= nTerms) {

            int nextTerm = firstTerm + secondTerm;
            System.out.print(nextTerm + " ");

            firstTerm = secondTerm;
            secondTerm = nextTerm;

            begin += 1;
        }

    }
}
