package com.dsa.binarysearch;

public class SearchInAnInfiniteArray {
    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 8, 12, 15, 18}; // consider it as infinite
        System.out.println(search1(arr, 18));
        System.out.println(search2(arr, 18));
    }

    private static int search2(int[] arr, int x) {
        if (arr[0] == x)
            return 0;
        int i = 1;
        while (arr[i] < x) {
            if (2 * i < arr.length - 1)
                i = i * 2;
            else
                i = arr.length - 1;
        }

        if (arr[i] == x)
            return i;
        return searchInSortedIterativeWay(arr, (i / 2) + 1, i - 1, x);
    }

    static int searchInSortedIterativeWay(int arr[], int l, int r, int K) {
        int start = l;
        int end = r;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == K)
                return 1;
            else if (arr[mid] > K)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return -1;
    }

    // Time Complexity - O(pos)
    private static int search1(int[] arr, int x) {
        int i = 0;
        while (true) {
            if (arr[i] == x) {
                return i;
            }
            if (arr[i] > x)
                return -1;
            i++;
        }
    }
}
