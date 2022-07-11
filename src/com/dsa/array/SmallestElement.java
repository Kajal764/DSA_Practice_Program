package com.dsa.array;

public class SmallestElement {
    public static void main(String[] args) {
        int a[] = {6, 7, 3, 1, 5, 0};
        System.out.println(findSmallest(a));
    }
    private static int findSmallest(int[] a) {
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min)
                min = a[i];
        }
        return min;
    }
}
// Time Complexity - O(n)
