package com.dsa.binarysearch;

public class SearchInSortedRotatedArray {
    public static void main(String[] args) {
        int arr[] = {100, 200, 300, 400, 10, 20};
        System.out.println(search1(arr, 10));
        System.out.println(search2(arr, 10));
    }

    // TC- O(logn)
    private static int search2(int[] arr, int x) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            // same as previous
            int mid = (left + right) / 2;
            if (arr[mid] == x) return mid;

            // left most array
            if (arr[left] < arr[mid]) {
                // if it comes here we can consider left is sorted
                // next step is to check no lies or not in that left range
                if (x >= arr[left] && x < arr[mid]) {
                    // it lies in the range
                    right = mid - 1;
                } else {
                    // not lie in the range
                    left = mid + 1;
                }
            }

            // Right most array is sorted
            else {
                if (x > arr[mid] && x <= arr[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

        }
        return -1;
    }

    // Time Complexity -  O(n)
    private static int search1(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }
}
