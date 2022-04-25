package arraysContinued;

import java.util.Scanner;

public class SearchingAndSortingAlgorithms {

    static Scanner s = new Scanner(System.in);

    // Scanning the array
    public static int[] getIntArray() {
        int[] arr = new int[s.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        return arr;
    }


    // Searching Algorithms
    // O(n)
    public static int linearSearch(int[] arr, int x) {

        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                index = i;
                break;
            }
        }

        return index;
    }

    // log base 2 n
    public static int binarySearch(int[] arr, int x) {

        int firstIndex = 0;
        int endIndex = arr.length - 1;

        while (firstIndex <= endIndex) {
            int midIndex = (firstIndex + endIndex) / 2;

            if (arr[midIndex] == x) {
                return midIndex;
            } else if (arr[midIndex] > x) {
                endIndex = midIndex - 1;
            } else {
                firstIndex = midIndex + 1;
            }
        }

        return -1;
    }

    // Bubble Sort Algorithm for Sorting Array
    // O(n^2)
    public static void bubbleSort(int[] arr) {
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i + 1] = temp;
                }
            }
        }
    }

    // Insertion Sort Algorithm for Sorting Array
    // O(n^2)
    public static void insertionSort(int[] arr) {
        int nextSmallestElementIndex = 0;
        while (nextSmallestElementIndex < arr.length) {

            // Find the smallest/minimum element in the array
            int currentSmallestElement = Integer.MAX_VALUE;
            int currentSmallestElementIndex = -1;
            for (int i = nextSmallestElementIndex; i < arr.length; i++) {
                if (arr[i] < currentSmallestElement) {
                    currentSmallestElement = arr[i];
                    currentSmallestElementIndex = i;
                }
            }

            // Swap the smallest element with the nextSmallestElementIndex
            // 1. At which index to place the smallest element
            // 2. The position of the smallest element - currentSmallestElementIndex, nextSmallestElementIndex

            int temp = arr[currentSmallestElementIndex];
            arr[currentSmallestElementIndex] = arr[nextSmallestElementIndex];
            arr[nextSmallestElementIndex] = temp;

            nextSmallestElementIndex += 1;

        }
    }

    public static int[] mergeTwoSortedArrays(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];
        int k = 0; // traversing over arr3

        int i = 0; // traversing over arr1
        int j = 0; // traversing over arr2
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                arr3[k] = arr1[i];
                i++; k++;
            } else if (arr2[j] < arr1[i]) {
                arr3[k] = arr2[j];
                j++; k++;
            } else {
                arr3[k] = arr1[i];
                k++; i++;
                arr3[k] = arr2[j];
                k++; j++;
            }
        }

        while (i < arr1.length) {
            arr3[k] = arr1[i];
            i++; k++;
        }

        while (j < arr2.length) {
            arr3[k] = arr2[j];
            j++; k++;
        }

        return arr3;
    }

    public static void mergeSortedArraysForMergeSort(int[] firstHalf, int[] secondHalf, int[] arr) {

        int i = 0; // firstHallf
        int j = 0; // secondHalf
        int k = 0; // arr

        while (i < firstHalf.length && j < secondHalf.length) {
            if (firstHalf[i] < secondHalf[j]) {
                arr[k] = firstHalf[i];
                i++; k++;
            } else if (secondHalf[j] < firstHalf[i]) {
                arr[k] = secondHalf[j];
                j++; k++;
            } else {
                arr[k] = firstHalf[i];
                k++; i++;
                arr[k] = secondHalf[j];
                k++; j++;
            }
        }

        while (i < firstHalf.length) {
            arr[k] = firstHalf[i];
            i++; k++;
        }

        while (j < secondHalf.length) {
            arr[k] = secondHalf[j];
            j++; k++;
        }

    }

    public static void mergeSort(int[] arr) {
        // Base case
        if (arr.length == 0 || arr.length == 1) {
            return;
        }

//        int n = arr.length;
        int[] firstHalf = new int[arr.length / 2];
        int[] secondHalf = new int[arr.length - firstHalf.length];

        // Copy the values to firstHalf - unsorted
        int k = 0;
        for (int i = 0; i < firstHalf.length; i++) {
            firstHalf[i] = arr[k];
            k++;
        }

        // Copying the secondHalf - unsorted
        for (int i = 0; i < secondHalf.length; i++) {
            secondHalf[i] = arr[k];
            k++;
        }

        // Induction Hypothesis
        mergeSort(firstHalf);
        mergeSort(secondHalf);

        // Induction Step
        mergeSortedArraysForMergeSort(firstHalf, secondHalf, arr); // n

    }

    public static void quickSort(int[] arr) {
        // Assignment
    }

    // Printing
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Main Area

        int[] arr = getIntArray();
//        int[] arr2 = getIntArray();
//
//        printArray(arr1);
//        printArray(arr2);
//
////        System.out.println(binarySearch(arr, s.nextInt()));
//
//        int[] arr3 = mergeTwoSortedArrays(arr1, arr2);
//        printArray(arr3);


        mergeSort(arr);
        printArray(arr);


    }

}
