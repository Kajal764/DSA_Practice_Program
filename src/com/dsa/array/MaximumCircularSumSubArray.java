package com.dsa.array;

public class MaximumCircularSumSubArray {

    public static void main(String args[]) {
        int arr[] = {5, -2, 3, 4}, n = 4;
        // System.out.println(maxCircularSum(arr, n));
        maxCircularSumEfficientWay(arr);
    }

    // Logic is first find normal array max sum which we will get from kaden's algorithm
    // then find circular sum
    // to find out this we will use logic like = max+min=total = so if max is circular then
    //min will no exist in normal array so we will use same algorithm and find min
    // to find minimun we will reverse array values with negative and find max of this
    // and then to get max value we will do = total-(-min)= total+min
    // and maximum of this will be ans
    //Time Complexity is O(n)
    private static int maxCircularSumEfficientWay(int[] arr) {

        if (arr.length == 0)
            return 0;
        int normalArraySum = kadanes(arr);
        int totalSum = 0;
        // reverse all te bits to find out minimum of normal sub array
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
            arr[i] = -arr[i];
        }
        int minimumSubArray = kadanes(arr);
        if (totalSum + minimumSubArray == 0)
            return normalArraySum;
        return Math.max(normalArraySum, totalSum + minimumSubArray);
    }

    private static int kadanes(int[] arr) {
        int currentSum = arr[0];
        int maxSum = arr[0];

        for (int i = 0; i < arr.length; i++) {
            currentSum = currentSum + arr[i];
            maxSum = Math.max(currentSum, maxSum);
            if (currentSum < 0)
                currentSum = 0;
        }
        return maxSum;
    }

    static int maxCircularSum(int arr[], int n) {
        int res = arr[0];
        for (int i = 0; i < n; i++) {
            int curr_max = arr[i];
            int curr_sum = arr[i];
            for (int j = 1; j < n; j++) {
                int index = (i + j) % n;  // Take modulo instead of j for circular traversing
                curr_sum += arr[index];
                curr_max = Math.max(curr_max, curr_sum);
            }
            res = Math.max(res, curr_max);
        }
        return res;
    }

}
