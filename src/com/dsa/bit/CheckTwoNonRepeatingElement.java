package com.dsa.bit;

public class CheckTwoNonRepeatingElement {
    public static void main(String[] args) {
        int a[] = {2, 1, 4, 1, 2, 3, 4, 7};
        check(a);
    }

    private static void check(int[] a) {
        int XOR = 0;
        // XOR=100 - 4
        for (int e : a) {
            XOR = XOR ^ e;
        }

        int tempXOR = XOR;
        // Mask= 100 - all the bits will be zero excluding least significant bits
        int mask = XOR & (~(XOR - 1));
        //tempXOR- 011 - 3
        for (int e : a) {
            if ((mask & e) == 0) {
                tempXOR = tempXOR ^ e;
            }
        }

        int firstNo = tempXOR; // 3
        int secondNo = XOR ^ firstNo; // 4  ^ 3= 7
        System.out.println(firstNo);
        System.out.println(secondNo);
    }
}
