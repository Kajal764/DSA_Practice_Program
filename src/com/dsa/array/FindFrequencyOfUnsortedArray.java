package com.dsa.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindFrequencyOfUnsortedArray {
    public static void main(String[] args) {
        int arr[] = new int[]{10, 30, 10, 20, 10, 20, 30, 10};
        int n = arr.length;
        //countFreq(arr, n);
        //  countFrequency(arr, n);
        countFreqUsingMap(arr);
    }

    //    Time Complexity : O(n2)
//    Space Complexity : O(n)
    private static void countFreq(int[] arr, int n) {
        boolean visited[] = new boolean[arr.length];
        Arrays.fill(visited, false);

        for (int i = 0; i < arr.length; i++) {
            if (visited[i] == true)
                continue;

            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }
            System.out.println(arr[i] + " occurs " + count + " times ");
        }
    }

    // Time Complexity : O(n^2)
// Aux Space Complexity : O(1)
    static void countFrequency(int[] array, int size) {

        for (int i = 0; i < size; i++) {
            int flag = 0;
            int count = 0;
            for (int j = i + 1; j < size; j++) {
                if (array[i] == array[j]) {
                    flag = 1;
                    break;
                }
            }
            // The continue keyword is used to end the current iteration
            // in a for loop (or a while loop), and continues to the next iteration
            if (flag == 1)
                continue;

            for (int j = 0; j <= i; j++) {
                if (array[i] == array[j])
                    count++;
            }
            System.out.println(array[i] + ": " + count);
        }
    }

    //    Time Complexity : O(n)
//    Space Complexity : O(n)
    private static void countFreqUsingMap(int[] arr) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (hashMap.containsKey(arr[i]))
                hashMap.put(arr[i], hashMap.get(arr[i]) + 1);
            else
                hashMap.put(arr[i], 1);
        }

        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " | " + entry.getValue());
        }
    }

}
