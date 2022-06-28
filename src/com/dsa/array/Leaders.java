package com.dsa.array;

public class Leaders {

    public static void main(String[] args) {
        int arr[] = {17, 10, 4, 10, 6, 5, 2}, n = 7;
        //  findLeaders(arr, n);
        findLeadersInEfficientWay(arr, n);
    }

    // Time Complexity O(n)
    private static void findLeadersInEfficientWay(int[] arr, int n) {
        int max = arr[n - 1];
        System.out.print(max+" ");
        for (int i = n-2; i >= 0; i--) {
            if(max < arr[i])
            {
                max=arr[i];
                System.out.print(arr[i]+" ");
            }
        }
    }

    // Naive Way
    // Time Complexity 0(n*n)
    private static void findLeaders(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            boolean flag = false;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] <= arr[j]) {
                    flag = true;
                    break;
                }
            }
            if (flag == false)
                System.out.println(arr[i]);
        }
    }
}
