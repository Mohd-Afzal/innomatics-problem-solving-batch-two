package basics;

import java.util.Scanner;

public class Fundamentals {

//    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

//        // input a, b and store it!
//
//        int a = 50; // Declaration + Initialization
////        int b; // Declaration
////        b = 20; // initialization
//        int b = 20;
//
//        int sum = a + b;
//
//        System.out.println(sum); // Prints the value in Sum
//        System.out.println("sum"); // this is a message


//        int p = 2000; int r = 7; int t = 2;
//
//        int si = (p * r * t) / 100;
//
//        System.out.println(si);


//        System.out.print("Print Num One: ");
//        int num1 = s.nextInt();
//
//        System.out.print("Print Num Two: ");
//        int num2 = s.nextInt();
//
//        System.out.println();

//        boolean value; // false
//        value = false;

//        boolean value = num1 < (num1 + num2);

//        if (num1 > num2) {
//            System.out.println(num1);
//        } else {
//            System.out.println(num2);
//        }

//        if (num1 > num2)
//            System.out.println(num1);
//        else
//            System.out.println(num2);


//        if (num2 > num1) {
//            System.out.println(num2);
//        }

//        System.out.println("End of the flow!");

        // 26 -> 27 -> 34(true) -> 35 -> 38(true) -> 39 -> 42 (not possible)
        // 26 -> 27 -> 34(false) -> 38(true) -> 39 -> 42 (num2 = 70, num1 = 50) 39, 42

        // 26 -> 27 -> 34(true) -> 35 -> 38(false) -> 42 (num2 = 50, num1 = 70) 35, 42
        // 26 -> 27 -> 34(false) -> 38(false) -> 42 (num2 = 50, num1 = 50)


        // s.nextLine(), s.next().charAt(0), s.next().charAt(0)

//        int a =  s.nextInt();  // 50;
//        short n = s.nextShort(); // 10;
//        byte p =  s.nextByte(); // 20;
//        long q = s.nextLong();  // 45;

//        double d = 56;
//        float x = 45.67;

//        double d = s.nextDouble();
//        System.out.println(a + " " + n + " " + p + " " + q + " " + d);
//
//        boolean b = s.nextBoolean();
//        System.out.println(b);
//
//        String str =  s.next();// s.nextLine() // "abc12;7[]";
//        System.out.println(str);


//        char ch = '3';
//
//        System.out.println(ch);


//        String name = s.nextLine();
//        String carName = s.next();
//
//        System.out.println(name);
//        System.out.println(carName);


//        System.out.println("Enter a character");
//        String name = s.next();
//        char nam = name.charAt(0);

//        System.out.println(name);

//        int a , b, c;
//        a = s.nextInt();
//        b = s.nextInt();
//        c = s.nextInt();
//
//        System.out.println(nam);
//        System.out.println(a + " " + b + " " + c);

//        int len = name.length();
//        char ch = name.charAt(2);
//
//        System.out.println(len);
//        System.out.println(ch);


//        int a = 10; // integer
//        int b = 20; // integer
//
//        int c = a + b; // integer
//
//        String name = "Afzal";
//
//        String ans = name + a; // String + Integer
//        System.out.println(30.67 + ans);

//        System.out.println(30  + 'a' + (20 + "Afzal") + (100 + 200) + false); //4020Afzal300false

        char ch = 'a' + 5; // a + 5
        System.out.println(ch);

//        https://leetcode.com/problems/add-binary/
//        https://leetcode.com/problems/roman-to-integer/

    }
}
