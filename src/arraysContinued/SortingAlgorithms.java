package arraysContinued;

import java.util.Scanner;

public class SortingAlgorithms {

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

        // Creating and scanning Array
        int[] arr = new int[s.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }


        // 1
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    // Swap the positions
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }

        // print the array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}
