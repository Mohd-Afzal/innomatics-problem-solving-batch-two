package basics;

import java.util.Scanner;

public class PatternFour {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int nRows = s.nextInt();

        int currRow = 1;
//        int i = 0;
        while (currRow <= nRows) {
            // printing spaces
//            int totalSpaces = nRows - 1;
            int space = 1;
            while (space <= nRows - currRow) {
                System.out.print(" ");
                space += 1;
            }
//            i++;
            // print stars
            int stars = 1;
            while (stars <= currRow) {
                System.out.print("*");
                stars += 1;
            }

            System.out.println();
            currRow += 1; // currRow++;
        }

    }
}
