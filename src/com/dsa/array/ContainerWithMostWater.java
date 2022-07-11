package com.dsa.array;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int arr[] = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(getMostWater(arr));
        System.out.println(containerWithMostWater(arr));
    }

    //Two pointer approach
    // Time Complexity - O(n)
    private static int containerWithMostWater(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int maxArea = 0;
        while (left < right) {
            int distance = right - left;
            int area = Math.min(arr[left], arr[right]) * distance;
            maxArea = Math.max(area, maxArea);
            if (arr[left] < arr[right])
                left++;
            else
                right--;
        }
        return maxArea;
    }

    // Time Complexity - O(n2)
    private static int getMostWater(int[] arr) {
        int maxArea = 0;
        for (int i = 0; i < arr.length; i++) {
            int left = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                int right = arr[j];
                int distance = j - i;
                int area = Math.min(left, right) * distance;
                maxArea = Math.max(area, maxArea);
            }
        }
        return maxArea;
    }
}
