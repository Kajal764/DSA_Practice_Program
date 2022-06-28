package com.dsa.recursion;

public class TowerOfHanoi {
    public static void main(String[] args) {
        towerOfHanoi(3, 'A', 'C', 'B');
    }

    private static void towerOfHanoi(int n, char A, char C, char B) {
        if (n == 0)
            return;
        towerOfHanoi(n - 1, A, B, C);
        System.out.println("Move " + n + " from " + A + " to " + C);
        towerOfHanoi(n - 1, B, C, A);
    }
}
