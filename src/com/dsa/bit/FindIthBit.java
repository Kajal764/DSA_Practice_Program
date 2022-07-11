package com.dsa.bit;

public class FindIthBit {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(findIthBit(n, 2));
    }

    private static int findIthBit(int n, int i) {
        int mask = 1 << i;
        int result = n & mask;
        if (result == 0) return 0;
        else return 1;
    }
}
