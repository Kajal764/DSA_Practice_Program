package com.dsa.array;

public class TransposeOfMatrix {
    public static void main(String[] args) {
        int a[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
       // transpose(a);
        transposeEfficientWay(a);
    }

    private static void transposeEfficientWay(int[][] a) {
        int n = a.length;
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }


    // TC - O(n2) - SC- O(n2) - by taking temp array
    private static void transpose(int[][] a) {
        int temp[][] = new int[a.length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                temp[i][j] = a[j][i];
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(temp[i][j] + " ");
            }
            System.out.println();
        }
    }
}
