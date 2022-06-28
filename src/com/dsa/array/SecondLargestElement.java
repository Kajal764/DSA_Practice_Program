package com.dsa.array;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {16, 16, 16};
        largestAndSecondLargest(arr.length, arr);
    }

    public static void largestAndSecondLargest(int sizeOfArray, int arr[]) {
        int largest = -1, secondLargest = -1;

        for (int i : arr){
            System.out.println(i);
        }
        for (int i = 0; i < sizeOfArray; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        System.out.println("largest " + largest);
        System.out.println("secondLargest " + secondLargest);
    }
}
