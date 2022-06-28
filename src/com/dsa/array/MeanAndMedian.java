package com.dsa.array;

import java.util.Arrays;

public class MeanAndMedian {
    public static void main(String[] args) {
        int a[] = {1, 3, 4, 2, 7, 5, 8, 6};
        int n = a.length;
        System.out.println("Mean = " + findMean(a, n));
        System.out.println("Median = " + findMedian(a, n));
    }

    private static double findMean(int[] a, int n) {
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum / n;
    }

    private static double findMedian(int[] a, int n) {
        Arrays.sort(a);
        if (n % 2 != 0)
            return a[n / 2];
        else
            return (a[n - 1] / 2 + a[n / 2]) / 2.0;
    }
}

//Input  : a[] = {1, 3, 4, 2, 6, 5, 8, 7}
//        Output : Mean = 4.5
//        Median = 4.5
//        Sum of the elements is 1 + 3 + 4 + 2 + 6 +
//        5 + 8 + 7 = 36
//        Mean = 36/8 = 4.5
//        Since number of elements are even, median
//        is average of 4th and 5th largest elements.
//        which means (4 + 5)/2 = 4.5