package com.dsa.array;

public class FindFrequencyOfSortedArray {

    public static void main(String[] args) {
        int arr[] = {10, 10, 20, 30, 30, 30, 40}, n = 7;
        printFreq(arr, arr.length);
    }

    private static void printFreqOfElements(int[] arr) {
        // Traverse the sorted array
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            // Move the index ahead whenever
            // you encounter duplicates
            while (i < arr.length - 1 && arr[i] == arr[i + 1]) {
                i++;
                count++;
            }
            System.out.println(arr[i] + ": " + count);
        }
    }


    //Time  Complexity O(n)
    static void printFreq(int arr[], int N) {

        int freq = 1;
        for (int i = 1; i < N; i++) {
            if (arr[i] == arr[i - 1]) {
                freq++;
            } else {
                System.out.println("Frequency of "
                        + arr[i - 1]
                        + " is: " + freq);
                freq = 1;
            }
        }

        System.out.println("Frequency of "
                + arr[N - 1]
                + " is: " + freq);
    }
//    private static void printFreq(int[] arr) {
////        int freq = 1, i = 1;
////            while (i < arr.length - 1) {
////
////                while (arr[i]==arr[i-1]){
////                freq++;
////                i++;
////            }
////            System.out.println(arr[i - 1] + " " + freq);
////            i++;
////            freq = 1;
////        }
////        if(arr[arr.length-1]!= arr[arr.length-2]){
////            System.out.println(arr[arr.length-1] +" "+freq);
////        }
//
//
//    }
}
