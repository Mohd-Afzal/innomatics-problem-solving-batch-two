package basics;

import java.util.Scanner;

public class PatternTwo {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int nRows = s.nextInt();

        int currRow = 1;
        while (currRow <= nRows) {
            // print cols for currRow times

            int currCol = 1;
            while (currCol <= currRow) {
                // Print numbers
                System.out.print(currCol);
                currCol += 1;
            }

            System.out.println();
            currRow += 1;
        }

//        https://www.hackerearth.com/problem/golf/print-the-pattern/
//        https://www.codingninjas.com/codestudio/problems/print-the-pattern_893299
    }
}
