package com.dsa.array;

public class MaximumConsecutiveOnes {
    public static void main(String[] args) {
        int arr[] = {0, 1, 1, 0, 1, 1, 1, 1, 1, 0};
        //  findConsecutiveNaiveWay(arr);
        findConsecutiveEfficientWay(arr);
    }

    //Time Complexity = O(n)
    private static void findConsecutiveEfficientWay(int[] arr) {
        int count = 0, res = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                count = 0;
            else {
                count++;
                res = Math.max(res, count);
            }
        }
        System.out.println(res);
    }

    //O(n2)
    private static void findConsecutiveNaiveWay(int[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == 1)
                    count++;
                else
                    break;
            }
            res = Math.max(res, count);
        }
        System.out.println(res);
    }
}
