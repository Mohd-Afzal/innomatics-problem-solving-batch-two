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
        System.out.println(binarySearch(arr, s.nextInt()));

    }

}
