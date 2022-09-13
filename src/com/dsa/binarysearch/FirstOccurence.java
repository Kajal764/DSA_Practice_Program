package com.dsa.binarysearch;

public class FirstOccurence {

    public static void main(String[] args) {
        int arr[] = {1, 3, 4, 4, 4, 5, 5, 6};
        // O(logn)- for first and last occurrences used both function simultaneously
        System.out.println(findFirst(arr, 4));
        System.out.println(findLast(arr, 4));
        System.out.println(firstAndLast(arr, 4));
    }

    private static int firstAndLast(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;
        int first = -1;
        int last = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (x < arr[mid]) {
                high = mid - 1;
            } else if (x > arr[mid]) {
                low = mid + 1;
            } else {
                if (mid == 0 || (arr[mid] != arr[mid - 1])) {
                    first = mid;
                    int count = 0;
                    while (arr[mid] == arr[mid + 1]) {
                        count++;
                        mid++;
                    }
                    last = first + count;
                    break;
                } else {
                    high = mid - 1;
                }
            }
        }
        System.out.println("**********");
        System.out.println(first + "  " + last);
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
}
