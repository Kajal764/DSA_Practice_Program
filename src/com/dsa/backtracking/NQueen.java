package com.dsa.backtracking;

public class NQueen {
    public static void main(String[] args) {
        int n = 4;
        int a[][] = new int[n][n];
        nQueen(a, n, 0);
        for (int[] arr : a) {
            for (int data : arr) {
                System.out.print(data + " ");
            }
            System.out.println();
        }
    }

    private static boolean nQueen(int[][] a, int n, int row) {
        // If all the rows are filled
        if (row == n) {
            return true;
        }

        for (int col = 0; col < n; col++) {
            if (isSafe(a, n, row, col)) {
                a[row][col] = 1;
                if (nQueen(a, n, row + 1)) {
                    return true;
                }
                // This will used to backtrack
                a[row][col] = 0;
            }
        }
        return false;
    }

    private static boolean isSafe(int[][] a, int n, int row, int col) {
        // will check in column if queen exist then return false
        // no need to check for row as we are going one by one row
        for (int i = 0; i < n; i++) {
            if (a[i][col] == 1)
                return false;
        }

        // Left diagonal check
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (a[i][j] == 1)
                return false;
        }

        // Right diagonal check
        for (int i = row, j = col; i >= 0 && j < n; i--, j++) {
            if (a[i][j] == 1)
                return false;
        }

        return true;
    }
}
