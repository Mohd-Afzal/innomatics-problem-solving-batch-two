package basics;

import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


//        int counter = 11; // initialization of the counter
//        while (counter <= 10) { // putting a condition over the counter
//            // While block!
//            System.out.println(counter);
//            counter = counter + 1; // Manipulating the counter/increment/decrement
//        }

//        int counter = 11;
//        for (; ; ) {
//            counter = counter + 1;
//            System.out.println(counter);
//        }


        // do - while
//        int counter = 11;
//        do {
//            System.out.println(counter);
//            counter = counter + 1;
//        } while(counter <= 10);


//        System.out.println("Exiting!");





        /* ---------------------- Type Conversion in Java ---------------------- */

        // Datatypes -> premitive -> int float double, boolean, short, byte

//        byte b = -128;
//        short sh = 32767;
//        int in = sh; // from short to int
//
////        System.out.println(sh + " " + in);
//
//        int num =  383; // 127 + 129 + 127; // in the range of byte!
//        byte p = (byte)num;
//
////        System.out.println(num + " " + p);
//
//        long l = num; // casting from int to long
//
//        long ln = 9223372036854775807l;
//        float f = 6789.6f;
//
//        // char -> integers -> 2bytes ---- A => 65
//
//        char ch = 65;
//        int a = 5678;
//
//        char anotherChar = (char)a;
//
////        System.out.println(ch + " " + anotherChar);
//
//        System.out.println((char)345678);


        // c = F - 32*5/9

        int s = sc.nextInt();
        int e = sc.nextInt();
        int w = sc.nextInt();

        while (s <= e) {
            int celcius = (int)((s-32) * (5/(double)9));
            System.out.println(s + "\t" + celcius);
            s = s + w;
        }

    }
}
