package basics;

import java.util.Scanner;

public class CheckPrime {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

//        int n = s.nextInt();
//
//        if (n == 0 || n == 1) {
//            System.out.println("Invalid Input");
//            return;
//        }

//        Way - 1
//        int generator = 1;
//        int factorsCount = 0;
//        while (generator <= n) {
//            if (n % generator == 0) {
//                // I must count a factor at this point
//                factorsCount += 1;
//            }
//            generator++;
//        }
//
//        if (factorsCount == 2) {
//            System.out.println(n + " is a Prime Number!");
//        } else {
//            System.out.println(n + " is not a Prime Number!");
//        }


        // Way - 2
//        int generator = 2;
//        boolean indicator = false;
//
//        while (generator <= n/2) {
//            if (n % generator == 0) {
//                // What does this mean? -> there is a third factor!
//                System.out.println(n + " is not a Prime Number!");
//                //Exit the loop!
//                indicator = true;
//                break;
//            }
//
//            generator++;
//        }
//
//        if (!indicator) {
//            System.out.println(n + " is a Prime Number!");
//        }



        int range = s.nextInt();
//        Actual Solution

        int counter = 2;
        while(counter <= range) {
            // if counter is prime or not. If prime, print it!
            int generator = 2;
            boolean indicator = false;

            while (generator <= counter/2) {
                if (counter % generator == 0) {
                    indicator = true;
                    break;
                }

                generator++;
            }

            if (!indicator) {
                System.out.println(counter + " is a Prime Number!");
            }
            
            counter += 1;
        }







    }
}
