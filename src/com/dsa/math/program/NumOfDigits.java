package com.dsa.math.program;

import static java.lang.Math.floor;
import static java.lang.Math.log10;

public class NumOfDigits {

    public static void main(String[] args) {
        int length = countDigit(489739);
        System.out.println(length);
    }

    //Logarithmic solution
    private static int countDigit(int num) {
        return (int) floor(log10(num) + 1);
    }

    //Iterative solution
//    private static int countDigit(int num) {
//        int length = 0;
//        while (num != 0) {
//            num = num / 10;
//            length++;
//        }
//        return length;
//    }

    //Recursive solution
//    private static int countDigit(int num) {
//        return 1 + countDigit(num / 10);
//    }

    //num= 123
    // 1+  123 / 10 -> 1 + 12 /10 -> 1+ 1/10
    //      3=   1+2     <-  1+1     <- 1+0
}
