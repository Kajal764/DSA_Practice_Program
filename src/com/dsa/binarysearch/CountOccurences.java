package com.dsa.binarysearch;

public class CountOccurences {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 30, 30, 40};
        System.out.println(count(arr, 30));
        System.out.println(countUsingFirstAndLast(arr, 30));
    }

    // It will take O(logn) which is better than O(n)
    private static int countUsingFirstAndLast(int[] arr, int x) {
        int first= findFirst(arr,30);
        if(first ==- 1)
            return 0;
        else return (findLast(arr,30) - first +1);
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
    private static int findLast(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (x < arr[mid]) {
                high = mid - 1;
            } else if (x > arr[mid]) {
                low = mid + 1;
            } else {
                if (mid == arr.length - 1 || (arr[mid] != arr[mid + 1])) {
                    return mid;
                } else {
                    low = mid + 1;
                }
            }
        }
        return -1;
    }

    // Time - O(n)
    private static int count(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }
        return count;
    }
}
