package com.dsa.array;

public class LargestElement {

    public static void main(String[] args) {
        int[] arr = {93, 5, 12, 46, 6};
        findTheLargestElement(arr);
    }

    private static int findTheLargestElement(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.println(max);
        return max;
    }
}
