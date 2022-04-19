package recursion;

import java.util.Scanner;

public class ProblemsOnRecursion {
    static Scanner s = new Scanner(System.in);

    public static int fact(int n) {
//        System.out.println("New input is : " + n);

        // base condition/terminating condition/end point
        if (n == 0) {
            return 1;
        }

        // Induction Hypothesis
        int smallAns = fact(n - 1); // Assuming that I will get the correct answer

        // Induction Step
        int myAns = n * smallAns;
        return myAns;
    }

    public static int sumOfN(int n) {
        // Base Condition
        if (n == 1) {
            return 1;
        }

        // Induction Hypothesis
        int smallAns = sumOfN(n - 1);

        // Induction Step
        int myAns = n + smallAns;
        return myAns;
    }

    public static void print(int n) {
        // Base case
        if (n == 1) {
            System.out.print(1 + " ");
            return;
        }

        // Induction Hypothesis
        print(n - 1);

        // Induction Step
        System.out.print(n + " ");
    }

    public static int sumOfArray(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }

        int smallArray[] = new int[arr.length - 1];
        for(int i = 0; i < smallArray.length; i++) {
            smallArray[i] = arr[i + 1];
        }

        int smallAns = sumOfArray(smallArray);
        int myAns = arr[0] + smallAns;

        return myAns;
    }

    public static int sumOfArrayUsingPointer(int[] arr, int index) {

        if (index == arr.length) {
            return 0;
        }

        int smallAns = sumOfArrayUsingPointer(arr, index + 1);
        int myAns = smallAns + arr[index];

        return myAns;
    }

    public static void printSubstring(String str) {
        for (int i = 0; i < str.length(); i++) {
            String subString = "";
            for (int j = i; j < str.length(); j++) {
                subString = subString + str.charAt(j);
                System.out.println(subString);
            }
        }
    }

    public static String[] subsequences(String str) {
        // Base case
        if (str == "") {
            String ans[] = new String[1];
            ans[0] = "";
            return ans;
        }

        // Induction Hypothesis
        String smallAns[] = subsequences(str.substring(1));

        // Step
        String myAns[] = new String[2 * smallAns.length];
        for (int i = 0; i < smallAns.length; i++) {
            myAns[i] = smallAns[i];
            myAns[i + smallAns.length] = str.charAt(0) + smallAns[i];
        }

        return myAns;
    }

    public static void printSubsequences(String str) {
        // Assignment
    }


    public static void main(String[] args) {

//        int ans = sumOfN(10);
//        System.out.println(ans);

//        int arr[] = {10, 5, 12, 15, 20};
//        System.out.println(sumOfArrayUsingPointer(arr, 0));


        // String
//        printSubstring("abcd");

//        String str = "abcde";
//
//        System.out.println(str.charAt(str.length()));
//
//        String substring = str.substring(str.length());
//        System.out.println(substring);
//
//        substring = str.substring(0, 4);
//        System.out.println(substring);

        // Subsequence

//        String ans[] = subsequences("abcd");
//
//        for (String str : ans) {
//            System.out.println(str);
//        }

    }
}
