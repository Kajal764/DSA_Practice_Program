package com.dsa.array;

public class ArrayInsert {

    public static void main(String[] args) {
        int arr[] = new int[6];
        for (int i = 0; i < 5; i++) {
            arr[i] = i + 1;
        }
        insertAtIndex(arr, 6, 2, 90);
    }

    public static void insertAtIndex(int arr[], int sizeOfArray, int index, int element) {
        if (index > sizeOfArray)
            return;
        else if (index == sizeOfArray - 1)
            arr[index] = element;
        else {
            for (int i = sizeOfArray - 2; i >= index; i--) {
                arr[i + 1] = arr[i];
            }
            arr[index] = element;
            for (int a : arr)
                System.out.print(a+" ");
        }
    }

    public void insertAtEnd(int arr[], int sizeOfArray, int element) {
        if (arr.length == sizeOfArray - 1)
            return;
        arr[sizeOfArray - 1] = element;
    }
}





