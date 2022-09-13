package com.dsa.binarysearch;

public class FindPairWithSum {
    public static void main(String[] args) {
        int arr[] = {2, 5, 8, 12, 30};
        System.out.println(find1(arr, 17));
        System.out.println(find2(arr, 17));
    }

    // TC- O(n) - bcoz in every iteration we either move left or right means traversing all the element
    private static boolean find2(int[] arr, int sum) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            // it will be < we can not use <= as same no can not form pair
            if (arr[left] + arr[right] == sum) {
                System.out.println(arr[left] + " " + arr[right]);
                return true;
            } else if (arr[left] + arr[right] > sum) {
                right--;
            } else {
                left++;
            }
        }
        return false;
    }

    // TC- O(n2)
    // worst case - theta(n2)
    private static boolean find1(int[] arr, int sum) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    System.out.println(arr[i] + " " + arr[j]);
                    return true;
                }
            }
        }
        return false;
    }
}
