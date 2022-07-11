package com.dsa.array;

public class SearchElementInSortedMatrix {
    public static void main(String[] args) {
        int a[][] = {
                {1, 4, 5, 7},
                {2, 5, 6, 9},
                {6, 10, 11, 13},
                {8, 12, 15, 18}
        };
        int key = 6;
        System.out.println(searchInAMatrix(a, key));
    }

    private static boolean searchInAMatrix(int[][] a, int key) {
        int row = 0;
        int col = a.length - 1;
        while (row < a.length && col >= 0) {
            if (a[row][col] == key) return true;
            else if (key > a[row][col])
                // to discard the current row
                row++;
            else col--;
        }
        return false;
    }
}
