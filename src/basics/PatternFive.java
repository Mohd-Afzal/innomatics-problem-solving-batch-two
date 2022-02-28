package basics;

import java.util.Scanner;

public class PatternFive {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int nRows = s.nextInt();

        int currRow = 1;
        while (currRow <= nRows) {

            //Print Spaces and Stars for P1
            int spaces = 1;
            while (spaces <= nRows - currRow) {
                System.out.print(" ");
                spaces += 1;
            }

            int stars = 1;
            while (stars <= currRow) {
                System.out.print("*");
                stars += 1;
            }
            // ----------- end of problem - 1  -----------


            // Print the stars for P2
            stars = 1;
            while (stars <= currRow - 1) {
                System.out.print("*");
                stars += 1;
            }
            // ----------- end of problem - 2  -----------


            System.out.println();
            currRow += 1;
        }

    }

}
