package arraysContinued;

import java.util.Scanner;

public class SortingAlgorithms {

    static Scanner s = new Scanner(System.in);


    public static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void subtract(int a, int b) {
        int sub = a - b;
        System.out.println(sub);
        return;
    }

    public static void greet() {
        System.out.println("Hello, guys! Welcome to the session!");
    }

    public static void main(String[] args) {

        // Creating and scanning Array
//        int[] arr = new int[s.nextInt()];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = s.nextInt();
//        }


//        // Bubble Sort Algorithm for Sorting Array
//        for (int j = 0; j < arr.length; j++) {
//            for (int i = 0; i < arr.length - 1; i++) {
//                if (arr[i] > arr[i + 1]) {
//                    // Swap the positions
//                    int temp = arr[i];
//                    arr[i] = arr[i + 1];
//                    arr[i + 1] = temp;
//                }
//            }
//        }


        // Insertion Sort Algorithm for Sorting Array
//        int nextSmallestElementIndex = 0;
//        while (nextSmallestElementIndex < arr.length) {
//
//            // Find the smallest/minimum element in the array
//            int currentSmallestElement = Integer.MAX_VALUE;
//            int currentSmallestElementIndex = -1;
//            for (int i = nextSmallestElementIndex; i < arr.length; i++) {
//                if (arr[i] < currentSmallestElement) {
//                    currentSmallestElement = arr[i];
//                    currentSmallestElementIndex = i;
//                }
//            }
//
//            // Swap the smallest element with the nextSmallestElementIndex
//            // 1. At which index to place the smallest element
//            // 2. The position of the smallest element - currentSmallestElementIndex, nextSmallestElementIndex
//
//            int temp = arr[currentSmallestElementIndex];
//            arr[currentSmallestElementIndex] = arr[nextSmallestElementIndex];
//            arr[nextSmallestElementIndex] = temp;
//
//            nextSmallestElementIndex += 1;
//
//        }
//
//
//        // print the array
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }



        int ans = add(40, 90);
        System.out.println(ans);

        subtract(100, 50);

        greet();

    }

}
