package arraysContinued;

import javax.swing.*;
import java.util.Scanner;
import java.util.Arrays;

public class ProblemsOnArrays {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // Taking input for array
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }



        /*
            Find Duplicate

            You have been given an integer array/list(ARR) of size N which contains
            numbers from 0 to (N - 2). Each number is present at least once. That is,
            if N = 5, the array/list constitutes values ranging from 0 to 3 and among
            these, there is a single integer value that is present twice.

            You need to find and return that duplicate number present in the array.
        */

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

//        int arraySum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            arraySum += arr[i];
//        }
//
//        // n == arr.length
//        int sumOfNMinusTwoNaturalNumbers = ((arr.length - 2) * (arr.length - 1)) / 2;
//        int duplicateNumber = arraySum - sumOfNMinusTwoNaturalNumbers;
//        System.out.println(duplicateNumber);



//          Once you have solved Sort 0 1
//        https://www.geeksforgeeks.org/sort-an-array-of-0s-1s-and-2s/



        /*
            Find Unique

            You have been given an integer array/list(ARR) of size N. Where N is equal to [2M + 1].
            Now, in the given array/list, 'M' numbers are present twice and one number is present only once.
            You need to find and return that number which is unique in the array/list.
        * */

        // Solution - 1 (Brute Force Approach)

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            int numberToCheck = arr[i];
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[j] == numberToCheck) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println(numberToCheck);
                break;
            }



//            // Left Part of the Array with respect to i
//            for (int k = 0; k < i; k++) {
//                if (arr[k] == numberToCheck) {
//                    found = true;
//                    break;
//                }
//            }
//
//            // Right Part of the Array with respect to i
//            if (found == false) {
//                for (int j = i + 1; j < arr.length; j++) {
//                    if (arr[j] == numberToCheck) {
//                        found = true;
//                        break;
//                    }
//                }
//            }
//
//            if (found == false) {
//                System.out.println(numberToCheck);
//                break;
//            }

        }




    }
}
