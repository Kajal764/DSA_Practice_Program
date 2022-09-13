package com.dsa.binarysearch;

public class TripletInSortedArray {
    public static void main(String[] args) {
        int arr[] = {2, 3, 5, 6, 15};
        System.out.println(find1(arr, 120));
        System.out.println(find2(arr, 120));
    }

    // TC - O(n2)
    private static boolean find2(int[] arr, int sum) {

        int first = 0, last = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            int second = i;
            while (first < second) {
                if (arr[first] + arr[last] == sum - arr[second])
                    return true;
                if (arr[first] + arr[last] < sum - arr[second])
                    first++;
                else
                    last--;
            }
        }
        return false;
    }

    // TC - O(n3)
    private static boolean find1(int[] arr, int sum) {
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int z = j + 1; z < arr.length; z++) {
                    if (arr[i] + arr[j] + arr[z] == sum)
                        return true;
                }
            }
        }
        return false;
    }
}
