package com.dsa.array;

public class ThirdLargest {
    public static void main(String[] args) {
        int a[] = {3, 4, 5, 1, 2};
        System.out.println(findThirdLargest(a, a.length));
    }

    private static int findThirdLargest(int[] a, int n) {
        int max1 = -1, max2 = -1, max3 = -1;
        for (int i = 0; i < n; i++) {
            if (a[i] > max1) {
                max3 = max2;
                max2 = max1;
                max1 = a[i];
            } else if (a[i] < max1 && a[i] > max2) {
                max3 = max2;
                max2 = a[i];
            } else if (a[i] < max1 && a[i] < max2 && a[i] > max3) {
                max3 = a[i];
            }
        }
        return max3;
    }
}

// T.C - O(n)