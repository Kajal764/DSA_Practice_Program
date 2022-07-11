package com.dsa.array;

public class MoveAllZero {
    public static void main(String[] args) {
        int arr[] = {6, 10, 8, 0, 0, 12, 0};
        move(arr);
    }
    private static void move(int[] arr) {
        int countOfNonZeros = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                {
                    int temp = arr[i];
                    arr[i] = arr[countOfNonZeros];
                    arr[countOfNonZeros] = temp;
                    countOfNonZeros++;
                }
            }
        }
        for (int data : arr) {
            System.out.print(data + "  ");
        }
    }
}
