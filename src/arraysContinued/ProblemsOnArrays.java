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

    // O(n^2)
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

    // O(nlogn)
    public static int findDuplicateOptimalOne(int[] arr) {
        // Solution - 2
        Arrays.sort(arr); // nlogn

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

    // O(n)
    public static int findDuplicateOptimal(int[] arr) {
        // Solution - 3

        int arraySum = 0; // k
        for (int i = 0; i < arr.length; i++) {
            arraySum += arr[i]; // nk
        }

        // n == arr.length
        int sumOfNMinusTwoNaturalNumbers = ((arr.length - 2) * (arr.length - 1)) / 2; // k
        int duplicateNumber = arraySum - sumOfNMinusTwoNaturalNumbers; // k
//        System.out.println(duplicateNumber);

        return duplicateNumber; // k
    }


    /*
            Find Unique

            You have been given an integer array/list(ARR) of size N. Where N is equal to [2M + 1].
            Now, in the given array/list, 'M' numbers are present twice and one number is present only once.
            You need to find and return that number which is unique in the array/list.
    */

    // O(n^2)
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

    // O(n)
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
    // O(n)
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

    // O(n^2)
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

    // O(logn)
    public static boolean binarySearch(int[] arr, int x) {

        int firstIndex = 0;
        int endIndex = arr.length - 1;

        while (firstIndex <= endIndex) {
            int midIndex = (firstIndex + endIndex) / 2;

            if (arr[midIndex] == x) {
                return true;
            } else if (arr[midIndex] > x) {
                endIndex = midIndex - 1;
            } else {
                firstIndex = midIndex + 1;
            }
        }

        return false;
    }
    //O(nlogn)
    public static void printIntersectionsOptimalOne(int[] arr1, int[] arr2) {
        Arrays.sort(arr2); // nlogn
        // Can apply Binary Search on Arr2

        // Incomplete - Instructor wants the students to brainstorm on the duplicate case
        for (int i = 0; i < arr1.length; i++) {
            int toSearch = arr1[i];

            if (binarySearch(arr2, toSearch)) {
                System.out.println(toSearch);
            }
        }

    }

    //O(nlogn)
    public static void printIntersectionsOptimalTwo(int[] arr1, int[] arr2) {
        // Prerequisite
        Arrays.sort(arr1);
        Arrays.sort(arr2);

//        6
//        5 10 20 20 20 30
//        8
//        2 3 4 5 20 20 40 50

        int i = 0;
        int j = 0;

        while(i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                System.out.println(arr1[i]);
                i++; j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }

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

        printIntersectionsOptimalTwo(arr1, arr2);

//        Assignment Questions
//        https://www.geeksforgeeks.org/sort-an-array-of-0s-1s-and-2s/ | Dutch National Flag Algorithm
//        https://leetcode.com/problems/search-in-rotated-sorted-array/
//        https://leetcode.com/problems/search-in-rotated-sorted-array-ii/
//        https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/

    }
}
