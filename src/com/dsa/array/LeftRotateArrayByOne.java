package com.dsa.array;

public class LeftRotateArrayByOne {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        leftRotate(arr);
    }

    private static void leftRotate(int[] arr) {
        int first = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length-1] = first;

        for (int data : arr) {
            System.out.print(data + "  ");
        }
    }
}
