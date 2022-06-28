package com.dsa.array;

public class TrappingRainWater {

    public static void main(String[] args) {
        int arr[] = {3, 0, 1, 2, 5};
//        getWater(arr);
        getWaterEfficientWay(arr);
    }

    //Time complexity O(n)
    private static void getWaterEfficientWay(int[] arr) {
        int n = arr.length;
        int res = 0;
        int leftArr[] = new int[arr.length];
        int rightArr[] = new int[arr.length];

        leftArr[0] = arr[0];
        for (int i = 1; i < n - 1; i++) {
            leftArr[i] = Math.max(arr[i], leftArr[i - 1]);
        }

        rightArr[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightArr[i] = Math.max(arr[i], rightArr[i + 1]);
        }

        for (int i = 1; i < n - 1; i++) {
            res = res + (Math.min(leftArr[i], rightArr[i]) - arr[i]);
        }

        System.out.println(res);
    }

    // Time Complexity O(n2)
    private static void getWater(int[] arr) {
        int res = 0, n = arr.length;
        for (int i = 1; i < n - 1; i++) {
            int leftMax = arr[i];
            for (int j = 0; j < i; j++) {
                leftMax = Math.max(leftMax, arr[j]);
            }
            int rightMax = arr[i];
            for (int j = i + 1; j < n; j++) {
                rightMax = Math.max(rightMax, arr[j]);
            }
            res = res + (Math.min(leftMax, rightMax) - arr[i]);
        }
        System.out.println(res);
    }

}
