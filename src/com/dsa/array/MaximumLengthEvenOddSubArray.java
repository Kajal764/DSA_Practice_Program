package com.dsa.array;

public class MaximumLengthEvenOddSubArray {
    public static void main(String[] args) {
        int arr[] = {5, 10, 20, 6, 3, 8};
     //   maxEvenOdd(arr);
        maxEvenOddEfficientWay(arr);
    }

    //Time Complexity = O(n2)
    private static void maxEvenOddEfficientWay(int[] arr) {
        int res = 1;
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if ((arr[i] % 2 == 0 && arr[i - 1] % 2 != 0) || (arr[i] % 2 != 0 && arr[i - 1] % 2 == 0)) {
                count++;
                res = Math.max(res, count);
            } else
                count = 1;
        }
        System.out.println(res);
    }

    // Time Complexity = O(n2)
    private static void maxEvenOdd(int[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[j] % 2 == 0 && arr[j - 1] % 2 != 0) || (arr[j] % 2 != 0 && arr[j - 1] % 2 == 0)) {
                    count++;
                } else
                    break;
            }
            res = Math.max(res, count);
        }
        System.out.println(res);
    }
}
