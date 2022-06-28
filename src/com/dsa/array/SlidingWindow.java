package com.dsa.array;

// given an array find the sum of the kth element and find maximum sum from them
public class SlidingWindow {
    public static void main(String[] args) {
        int arr[] = {1, 8, 30, -5, 20, 7}, n = 6, k = 3;
        System.out.println(maxSum1(arr, n, k));
    }

    //Time complexity = O(n2)
    private static int maxSum1(int[] arr, int n, int k) {
        int maxSum = 0;
        for (int i = 0; i + k - 1 < n; i++) {
            int sum = 0;
            for (int j = 0; j < k; j++) {
                sum = sum + arr[i + j];
            }
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}
