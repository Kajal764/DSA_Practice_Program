package com.dsa.sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int a[] = {5, 9, 1, 2, 3, 0};
        sort(a);
    }

    // Time C - O(n2)
    // Space -
    private static void sort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            boolean isSwapped = false;
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    isSwapped = true;
                }
                // If element are already sorted then it should break
                if (!isSwapped) break;
            }
        }
        for (int d : a) {
            System.out.print(d + " ");
        }
    }
}
