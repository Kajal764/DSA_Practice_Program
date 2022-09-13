package com.dsa.binarysearch;

public class SearchElement {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        System.out.println(binarySearch(arr, 0, 5, 9));

    }

    // O(logn)
    static int searchInSortedIterativeWay(int arr[], int N, int K) {
        int start = 0;
        int end = N - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // int mid = (start + end) / 2;
            if (arr[mid] == K)
                return 1;
            else if (arr[mid] > K)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return -1;

    }

    // O(logn)
//    static int searchInSorted(int arr[], int N, int K) {
//        return helper(arr, 0, N, K);
//    }
//
//    private static int helper(int[] arr, int low, int high, int x) {
////        if (low > high) return -
//        if (high >= low) {
//            int mid = (low + high) / 2;
//            if (arr[mid] == x) return mid;
//            else if (x < arr[mid])
//                helper(arr, low, mid - 1, x);
//            else
//                helper(arr, mid + 1, high, x);
//        }
//        return -1;
//    }

    static int binarySearch(int arr[], int l, int r, int x) {

        if (l >= r)
            return -1;
        int mid = (l + r) / 2;
        // int mid = l + (r - l) / 2;
        if (arr[mid] == x)
            return mid;
        if (arr[mid] > x)
            return binarySearch(arr, l, mid - 1, x);
        return binarySearch(arr, mid + 1, r, x);

        // return -1;
    }
}