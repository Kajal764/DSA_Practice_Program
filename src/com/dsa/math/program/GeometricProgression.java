package com.dsa.math.program;

// Tn = a1 * r(n-1)
public class GeometricProgression {
    public static void main(String[] args) {
        int a = 2; // starting number
        int r = 2; // Common ratio
        int n = 5; // N th term to be find
        printGP(a, r, n);
    }

    private static void printGP(int a, int r, int n) {
        for (int i = 0; i < n; i++) {
            int currentTerm = (int) (a * Math.pow(r, i));
            System.out.print(currentTerm + " ");
        }
    }
}
