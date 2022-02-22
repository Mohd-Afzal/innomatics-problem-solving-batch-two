package basics;

import java.util.Scanner;

public class PatternThree {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int nRows = s.nextInt();

        int currRow = 1;
        while(currRow <= nRows) {

            int currCol = 1;
            char ch = 'F';
            while (currCol <= currRow) {
                System.out.print(ch);
//                ch += 1;
                 ch++;
                currCol += 1;
            }

            System.out.println();
            currRow += 1;
        }
    }
}
