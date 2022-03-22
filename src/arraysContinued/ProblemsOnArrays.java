package arraysContinued;

import java.util.Scanner;
import java.util.Arrays;

public class ProblemsOnArrays {

    static Scanner s = new Scanner(System.in);

    public static int[] getIntArray() {
        int[] arr = new int[s.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        return arr;
    }


    /*
            Find Duplicate

            You have been given an integer array/list(ARR) of size N which contains
            numbers from 0 to (N - 2). Each number is present at least once. That is,
            if N = 5, the array/list constitutes values ranging from 0 to 3 and among
            these, there is a single integer value that is present twice.

            You need to find and return that duplicate number present in the array.
    */

    public static int findDuplicateBruteForce(int[] arr) {
        // Solution - 1 (fucking slow!) (n * (n + 1) / 2 iterations ) - findDuplicateBruteForce

        int ans = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            boolean hasExitedInnerLoop = false;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
//                    System.out.println(arr[i]);
                    ans = arr[i];
                    hasExitedInnerLoop = true;
                    break;
                }
            }
            if (hasExitedInnerLoop) {
                break;
            }
        }

        return ans;
    }

    public static int findDuplicateOptimalOne(int[] arr) {
        // Solution - 2
        Arrays.sort(arr);

        int ans = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[i + 1]) {
                ans = arr[i];
//                System.out.println(arr[i]);
                break;
            }
        }

        return ans;
    }

    public static int findDuplicateOptimal(int[] arr) {
        // Solution - 3

        int arraySum = 0;
        for (int i = 0; i < arr.length; i++) {
            arraySum += arr[i];
        }

        // n == arr.length
        int sumOfNMinusTwoNaturalNumbers = ((arr.length - 2) * (arr.length - 1)) / 2;
        int duplicateNumber = arraySum - sumOfNMinusTwoNaturalNumbers;
//        System.out.println(duplicateNumber);

        return duplicateNumber;
    }


    /*
            Find Unique

            You have been given an integer array/list(ARR) of size N. Where N is equal to [2M + 1].
            Now, in the given array/list, 'M' numbers are present twice and one number is present only once.
            You need to find and return that number which is unique in the array/list.
    */

    public static int findUniqueBruteForce(int[] arr) {
        // Solution - 1 (Brute Force Approach)

        int ans = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            boolean found = false;
            int numberToCheck = arr[i];

            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[j] == numberToCheck) {
                    found = true;
                    break;
                }
            }

            if (!found) {
//                System.out.println(numberToCheck);
                ans = numberToCheck;
                break;
            }


            // Left Part of the Array with respect to i
            for (int k = 0; k < i; k++) {
                if (arr[k] == numberToCheck) {
                    found = true;
                    break;
                }
            }

            // Right Part of the Array with respect to i
            if (found == false) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] == numberToCheck) {
                        found = true;
                        break;
                    }
                }
            }

            if (!found) {
//                System.out.println(numberToCheck);
                ans = numberToCheck;
                break;
            }

        }

        return ans;
    }

    public static int findUniqueOptimal(int[] arr) {
        // Solution - 3 Optimal one using XOR(^)
//        https://www.maximintegrated.com/en/glossary/definitions.mvp/term/xor-gate/gpk/1202

        // Solving in just one pass
        int unique = 0;
        for (int i = 0; i < arr.length; i++) {
            unique = unique ^ arr[i];
        }

//        System.out.println(unique);

        return unique;
    }

    // Sort 0 and 1
    public static void sort01(int[] arr) {

        int nextZeroIndex = 0;
        int pickerIndex = 0;

        while (pickerIndex < arr.length) {
            if (arr[pickerIndex] == 0) {
                int temp = arr[nextZeroIndex];
                arr[nextZeroIndex] = arr[pickerIndex];
                arr[pickerIndex] = temp;

                nextZeroIndex += 1;
                pickerIndex += 1;
            } else {
                pickerIndex += 1;
            }
        }

    }


    public static void printIntersectionsBrute(int[] arr1, int[] arr2) {
//        5
//        10 2 8 20 3
//        7
//        3 25 2 5 20 2 2

        for (int i = 0; i < arr1.length; i++) {

            int toSearch = arr1[i];
            for (int j = 0; j < arr2.length; j++) {
                if (arr2[j] == toSearch) {
                    System.out.println(toSearch);
                    arr2[j] = Integer.MIN_VALUE; // Marking the element visited in arr2
                    break;
                }
            }

        }

    }


    public static void printIntersectionsOptimalOne(int[] arr1, int[] arr2) {
        // Binary Search

    }



    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {

        // Taking input for array
        int[] arr1 = getIntArray();
        int[] arr2 = getIntArray();
        printIntersectionsBrute(arr1, arr2);



//        https://www.geeksforgeeks.org/sort-an-array-of-0s-1s-and-2s/ | Dutch National Flag Algorithm

    }
}
