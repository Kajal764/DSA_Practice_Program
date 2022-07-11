package com.dsa.array;

public class LargestElementOnRight {
    public static void main(String[] args) {
        int arr[] = {7, 5, 8, 9, 6, 8, 5, 7, 4, 6};
        nextGreatest(arr, arr.length);
    }

    private static void nextGreatest(int[] arr, int n) {
        int max = arr[n - 1];
        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = max;
            if (max < temp) {
                max = temp;
            }
        }
        arr[n - 1] = -1;
        for (int d : arr) {
            System.out.print(d + " ");
        }
    }
}
