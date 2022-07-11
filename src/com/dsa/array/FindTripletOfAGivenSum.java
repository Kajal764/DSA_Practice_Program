package com.dsa.array;

import java.util.Arrays;

public class FindTripletOfAGivenSum {
    public static void main(String[] args) {
        int a[] = {1, 2, 4, 7, 3, 5, -2, 1};
        System.out.println(findTriplet(a, 9));
    }

    private static boolean findTriplet(int[] a, int sum) {
        Arrays.sort(a);
        for (int i = 0; i < a.length - 2; i++) {
            int l = i + 1;
            int r = a.length - 1;
            while (l < r) {
                if (a[i] + a[l] + a[r] == sum) {
                    return true;
                } else if (a[i] + a[l] + a[r] < sum) {
                    l++;
                } else {
                    r--;
                }
            }
        }
        return false;
    }
}
// Time Complexity  -  O(N^2)+ O(nlogn)= O(N^2)