package com.dsa.math.program;

public class NthTermOfGeometricProgression {
    public static void main(String[] args) {
        int a = 2; // starting number
        int r = 2; // Common ratio
        int n = 4; // N th term to be find
        System.out.println(findNthTerm(a, r, n));
    }

    private static int findNthTerm(int a, int r, int n) {
        return (int) (a * Math.pow(r, n - 1));
    }
}
