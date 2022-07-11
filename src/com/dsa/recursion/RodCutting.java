package com.dsa.recursion;

public class RodCutting {
    public static void main(String[] args) {
        int N = 25;
        int a = 6;
        int b = 7;
        int c = 13;
        System.out.println(maxRods(N, a, b, c));
    }

    private static int maxRods(int N, int a, int b, int c) {
        if (N == 0) return 0;
        if (N < 0) return -1;
        int cutA = maxRods(N - a, a, b, c);
        int cutB = maxRods(N - b, a, b, c);
        int cutC = maxRods(N - c, a, b, c);
        int res = Math.max(cutA, Math.max(cutB, cutC));
        if (res == -1) return -1;
        //+1 bcoz while sending recursion call we are calling n-1 -> so first call need to add here
        return res + 1;
    }
}
