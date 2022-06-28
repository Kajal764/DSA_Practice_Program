package com.dsa.array;

//Maximum diff of arr[j]-arr[i] such that j > i

public class MaximumDifference {

    public static void main(String[] args) {
        int arr[] = {2, 3, 10, 6, 4, 8, 1};
//      maxDiffNaiveWay(arr, arr.length);
        maxDiffEfficientWay(arr, arr.length);
    }

    // Time complexity O(n) and O(1) aux space
    private static void maxDiffEfficientWay(int[] arr, int n) {
        int max = arr[1] - arr[0];
        int min = arr[0];
        for (int j = 1; j < n; j++) {
            int value = arr[j] - min;
            max = Math.max(max, value);
            min = Math.min(min, arr[j]);
        }
        System.out.println(max);
    }

    // Time complexity O(n2)
    private static void maxDiffNaiveWay(int[] arr, int n) {
        int maxDiff = arr[1] - arr[0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < n; j++) {
                maxDiff = Math.max(maxDiff, arr[j] - arr[i]);
            }
        }
        System.out.println(maxDiff);
    }
}
