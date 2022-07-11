package com.dsa.bit;

public class CountNoOfSetBits {
    public static void main(String[] args) {
        countSetBitsOptimizeway(13);
    }

    private static void countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) == 1)
                count++;
            n = n >> 1;
        }
        System.out.println(count);
    }
    // Time Complexity - O(logn)

    // In this least significant bits turn to 0
    // so after turning it to 0 no will change instead of traversing to all
    //the bits it will traverse only for 1  bit
    // but still worst case time complexity will be O(logn)
    private static void countSetBitsOptimizeway(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n = n & n - 1;
        }
        System.out.println(count);
    }

}
