package com.dsa.bit;

public class SwapTwoBits {
    public static void main(String[] args) {
        System.out.println(swapBit(10, 1, 2));
    }

    static int swapBit(int n, int i, int j) {
        int ith = (n >> i) & 1;
        int jth = (n >> j) & 1;
        if (ith == jth) return n;
        int mask = (1 << i) | (1 << j);
        return n ^ mask;
    }
}
