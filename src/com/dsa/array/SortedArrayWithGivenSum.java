package com.dsa.array;

public class SortedArrayWithGivenSum {
    public static void main(String[] args) {
        int a[] = {2, 3, 4, 7, 8, 12};
        System.out.println(findSum(a, 10));
    }

    private static boolean findSum(int[] a, int sum) {
        int l = 0;
        int r = a.length - 1;
        while (l < r) {
            int currSum = a[l] + a[r];
            if (currSum > sum) r--;
            else if (currSum < sum) l++;
            else return true;
        }
        return false;
    }
}
