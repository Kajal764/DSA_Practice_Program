package com.dsa.binarysearch;

public class FindPeakElement {
    public static void main(String[] args) {
        int arr[] = {5, 10, 20, 15, 7};
        System.out.println(find1(arr));
        System.out.println(find2(arr));
    }


    // here we need to consider a fact that if mid > a[left] then we can find out peak
    // in left or else right
    //TC - O(logn)
    private static int find2(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if ((mid == 0 || (arr[mid - 1] <= arr[mid]))
                    && (mid == arr.length - 1) || (arr[mid + 1] <= arr[mid])) {
                return arr[mid];
            }
            if (mid > 0 && arr[mid - 1] >= arr[mid])
                right = mid - 1;
            else
                left = mid + 1;
        }
        return -1;
    }

    // TC - O(n)
    private static int find1(int[] arr) {
        // first check if only one element present
        if (arr.length == 1) return arr[0];
        // then check corner case left and right
        if (arr[0] >= arr[1]) return arr[0];
        if (arr[arr.length - 1] >= arr[arr.length - 2]) return arr[arr.length - 1];
        // id above condition not works then check for mid element

        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            if (current >= arr[i - 1] && current >= arr[i + 1])
                return current;
        }
        return -1;
    }
}
