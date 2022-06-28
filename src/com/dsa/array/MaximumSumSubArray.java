package com.dsa.array;

public class MaximumSumSubArray {

    public static void main(String[] args) {
        int arr[] = {1, -2, 3, -1, 2};
        //    getMaximumSum(arr);
        // getMaximumSumEfficientWay(arr);
        getMaximumSum1(arr);
    }

    // Time complexity = O(n2) - if the sum is giving negative no we will discard it
    // also called Kadane's Algorithm
    private static void getMaximumSum1(int[] arr) {
        int currSum = 0;
        int maxSum = 0;
        for (int i = 0; i < arr.length; i++) {
            currSum = currSum + arr[i];
            maxSum = Math.max(maxSum, currSum);
            if (currSum < 0) {
                currSum = 0;
            }
        }
        System.out.println(maxSum);
    }

    // Time Complexity = O(n2)
//    int arr[] = {1, -2, 3, -1, 2};
//    maxEnding = 1 , -1 , 3 , 2 , 4
    private static void getMaximumSumEfficientWay(int[] arr) {
        int res = arr[0];
        int maxEnding = arr[0];

        for (int i = 1; i < arr.length; i++) {
            maxEnding = Math.max(maxEnding + arr[i], arr[i]);
            res = Math.max(res, maxEnding);
        }
        System.out.println(res);
    }

    private static void getMaximumSum(int[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            int current = 0;
            for (int j = i; j < arr.length; j++) {
                current = current + arr[j];
                res = Math.max(current, res);
            }
        }
        System.out.println(res);
    }

}
