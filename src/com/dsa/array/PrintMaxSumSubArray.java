package com.dsa.array;

public class PrintMaxSumSubArray {
    public static void main(String[] args) {
        int arr[] = {1, -2, 3, -1, 2};
        printMaximumSum(arr);
    }

    private static void printMaximumSum(int[] arr) {
        int currSum = 0, maxSum = 0, start = 0, end = 0;
        for (int i = 0; i < arr.length; i++) {
            currSum = currSum + arr[i];
            if (currSum > maxSum) {
                maxSum = currSum;
                end = i;
            }
            //  maxSum = Math.max(maxSum, currSum);
            if (currSum < 0) {
                currSum = 0;
                start = i + 1;
            }
        }
        System.out.println(maxSum);
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
