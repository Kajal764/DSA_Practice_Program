package com.dsa.array;

//rotate element BY D
public class LeftRotateArrayByD {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        // leftRotateFirstWay(arr, 2);
        // leftRotateSecondWay(arr, 2);
        leftRotateThirdWay(arr, 2);
    }


    //First way time complexity O(nd) and Aux space = O(1)
    private static void leftRotateFirstWay(int[] arr, int d) {
        for (int i = 0; i < d; i++) {
            leftRotate(arr);
        }
    }

    private static void leftRotate(int[] arr) {
        int first = arr[0];
//        for (int i = 0; i < arr.length - 1; i++) {
//            arr[i] = arr[i + 1];
//        }
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = first;
        for (int data : arr) {
            System.out.print(data + "  ");
        }
        System.out.println();
    }

    // Time complexity O(n) and aux space O(d)
    private static void leftRotateSecondWay(int[] arr, int d) {
        int temp[] = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        } // temp -> { 1,2 }
        for (int i = d; i < arr.length; i++) {
            arr[i - d] = arr[i];
        } //{ 3  4  5  4  5 }
        int n = arr.length;
        for (int i = 0; i < d; i++) {
            arr[n - d + i] = temp[i];
        }
        for (int data : temp) {
            System.out.print(data + "  ");
        }
        System.out.println();
        for (int data : arr) {
            System.out.print(data + "  ");
        }
    }

    // Time O(d+n-d+n) == O(2n) == O(n)
    // Aux Space == O(1)
    private static void leftRotateThirdWay(int[] arr, int d) {
        // {1,2,3,4,5}
        rotateArray(arr, 0, d - 1);  // { 2, 1, 3 , 4, 5 } // d
        rotateArray(arr, d, arr.length - 1);  // { 2, 1, 5 , 4, 3 }   // n-d
        rotateArray(arr, 0, arr.length - 1);  // { 3 , 4, 5 , 1, 2 }   //n
        for (int data : arr) {
            System.out.print(data + "  ");
        }
    }

    private static void rotateArray(int[] arr, int low, int high) {
        while (low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }
}
