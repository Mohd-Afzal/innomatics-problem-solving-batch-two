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

    public static void main(String[] args) {

        int ans = fact(4);
        System.out.println(ans);

    }
}
