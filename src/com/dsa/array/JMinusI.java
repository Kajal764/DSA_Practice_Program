package com.dsa.array;

public class JMinusI {
    public static void main(String[] args) {
        int arr[] = {4, 3, 5, 1, 4, 2, 1};
        System.out.println(maxValueOfJMinusI(arr));
    }

    private static int maxValueOfJMinusI(int[] arr) {
        int n = arr.length;
        int rightMax[] = new int[n];
        int leftMin[] = new int[n];
        // will fill from last index for right
        rightMax[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(arr[i], rightMax[i + 1]);
        }
        leftMin[0] = arr[0];
        for (int i = 1; i < n; i++) {
            leftMin[i] = Math.min(arr[i], leftMin[i - 1]);
        }
        int i = 0, j = 0, ans = 0;
        while (i < n && j < n) {
            if (leftMin[i] < rightMax[j]) {
                ans = Math.max(ans, j - i);
                j++;
            } else {
                i++;
            }
        }
        return ans;
    }
}
