package com.dsa.array;

public class SmallestSumSubArray {
    public static void main(String[] args) {
        int arr[] = {3, -4, 2, -3, -1, 7, -5};
        System.out.println(smallestSumSubarray(arr, arr.length));
    }

    static int smallestSumSubarray(int a[], int size) {
        int sum = Integer.MAX_VALUE;
        int currentSum = Integer.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            if (currentSum > 0) {
                currentSum = a[i];
            } else {
                currentSum += a[i];
            }
            if (currentSum < sum)
                sum = currentSum;
        }
        return sum;
    }
}
// Time complexity - O(n)