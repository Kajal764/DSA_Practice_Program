package com.dsa.array;

public class ArrayIsSorted {

    public static void main(String[] args) {
        int arr[] = {3, 8, 11, 13, 13, 64};
        System.out.println(checkArraySortedOrNot(arr));
    }

    private static boolean checkArraySortedOrNot(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1])
                return false;
        }
        return true;
    }
}
