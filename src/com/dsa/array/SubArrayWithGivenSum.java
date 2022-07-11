package com.dsa.array;

import java.util.HashSet;
// Prefix approach
public class SubArrayWithGivenSum {
    public static void main(String[] args) {
        int arr[] = {2, 3, 1, -4, 3, -2};
        System.out.println(subArrayWithZeroSum(arr));
    }

    //To print the data will use hashmap instead of set
    private static boolean subArrayWithZeroSum(int[] arr) {
        //int prefixSum[] = new int[arr.length];
        // if we used array to store sum we need to use one mor for loop to check whether the element is repeated or not
        // so we will use set - so its time complexity is O(1)
        HashSet<Integer> prefixSum = new HashSet<>();
        int sum = 0;
        // Add 0 sum in set bcoz for {10,-10 } - it should work
        prefixSum.add(sum);
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (prefixSum.contains(sum)) {
                return true;
            }
            prefixSum.add(sum);
        }
        return false;
    }
}
// Time Complexity - O(n)