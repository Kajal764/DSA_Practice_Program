package com.dsa.binarysearch;

public class Count1s {
    public static void main(String[] args) {
        int arr[] = {0, 0, 0, 0, 1, 1, 1};
        System.out.println(count(arr));
        System.out.println(countEff(arr));
    }

    // It will take O(logn)
    private static int countEff(int[] arr) {
        int first = findFirst(arr, 1);
        return arr.length - first;
    }

    private static int findFirst(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (x < arr[mid]) {
                high = mid - 1;
            } else if (x > arr[mid]) {
                low = mid + 1;
            } else {
                if (mid == 0 || (arr[mid] != arr[mid - 1])) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    // O(n)
    private static int count(int[] arr) {
        int i = 0;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                break;
            }
        }
        return arr.length - i;
    }
}
