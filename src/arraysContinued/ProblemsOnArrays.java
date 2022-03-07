package arraysContinued;

import java.util.Scanner;
import java.util.Arrays;

public class ProblemsOnArrays {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        /*
            Find Duplicate

            You have been given an integer array/list(ARR) of size N which contains
            numbers from 0 to (N - 2). Each number is present at least once. That is,
            if N = 5, the array/list constitutes values ranging from 0 to 3 and among
            these, there is a single integer value that is present twice.

            You need to find and return that duplicate number present in the array.
        */

        int n = s.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        // Solution - 1 (fucking slow!) (n * (n + 1) / 2 iterations )
//        for (int i = 0; i < arr.length; i++) {
//            boolean hasExitedInnerLoop = false;
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] == arr[j]) {
//                    System.out.println(arr[i]);
//                    hasExitedInnerLoop = true;
//                    break;
//                }
//            }
//            if (hasExitedInnerLoop) {
//                break;
//            }
//        }

        // Solution - 2
//        Arrays.sort(arr);
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == arr[i + 1]) {
//                System.out.println(arr[i]);
//                break;
//            }
//        }


        // Solution - 3

        int arraySum = 0;
        for (int i = 0; i < arr.length; i++) {
            arraySum += arr[i];
        }

        // n == arr.length
        int sumOfNMinusTwoNaturalNumbers = ((arr.length - 2) * (arr.length - 1)) / 2;

        int duplicateNumber = arraySum - sumOfNMinusTwoNaturalNumbers;

        System.out.println(duplicateNumber);


//          Once you have solved Sort 0 1
//        https://www.geeksforgeeks.org/sort-an-array-of-0s-1s-and-2s/


    }
}
