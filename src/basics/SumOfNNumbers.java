package basics;

import java.util.Scanner;

public class SumOfNNumbers {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int total = 0;
//        int counter = 2;
//        while (counter <= n) {
//            total += counter;
//            counter += 2;
//        }


        int counter = 1;
        while (counter <= n) {
//            counter - is it even?
            if (counter % 2 == 0) {
                total += counter;
            }
            counter += 1;
        }

        System.out.println(total);
    }
}
