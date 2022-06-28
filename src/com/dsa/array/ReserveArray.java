package com.dsa.array;

public class ReserveArray {
    public static void main(String[] args) {
        int arr[] = {5, 4, 0, 3, 2, 1};
        reverse(arr);
    }

    private static int[] reverse(int arr[]) {
        int first = 0;
        int last = arr.length - 1;
        int temp = 0;
        while (first < last) {
            temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
        for (int d : arr) {
            System.out.print(d + " ");
        }
        return arr;
    }
}
