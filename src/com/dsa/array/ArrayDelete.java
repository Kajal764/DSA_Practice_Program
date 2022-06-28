package com.dsa.array;

public class ArrayDelete {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        deleteElement(arr, 6, 3);
    }

    private static int deleteElement(int[] arr, int size, int element) {
        int i=0;
        for (; i < size; i++) {
            if (arr[i] == element)
                break;
        }
        if (i == size)
            return size;
        for (int j = i; j < size - 1; j++) {
            arr[j] = arr[j + 1];
        }
        arr[size - 1] = 0;
        for (int a : arr) {
            System.out.print(a + " ");
        }
        return size - 1;
    }
}
