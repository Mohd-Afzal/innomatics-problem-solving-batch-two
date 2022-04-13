package recursion;

import java.util.Scanner;

public class RecursionBasics {
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


    public static void main(String[] args) {

//        int ans = sumOfN(10);
//        System.out.println(ans);

        print(10);
    }
}
