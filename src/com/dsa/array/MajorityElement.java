package com.dsa.array;

// No which appears more than n/2 times in an array
public class MajorityElement {

    public static void main(String[] args) {
        int arr[] = {3, 4, 5, 3, 3, 4, 5, 3, 3};
        //  System.out.println(findMajorityElement(arr));
        System.out.println(findMajorityElementEfficientWay(arr));
    }

    //first find the element then find out whether it's majority or not
    // Time Complexity = O(n)
    //Using Moore’s Voting Algorithm
    private static int findMajorityElementEfficientWay(int[] arr) {
        int currentElement = arr[0];
        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            if (count == 0) {
                currentElement = arr[i];
                count = 1;
            }
            if (currentElement == arr[i]) {
                count++;
            } else {
                count--;
            }
        }
        int majorityCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (currentElement == arr[i])
                majorityCount++;
            if (majorityCount > arr.length / 2) {
                return arr[i];
            }
        }
        return -1;
    }

    //Time complexity = O(n2)
    private static int findMajorityElement(int[] arr) {
        System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    count++;
                if (count > arr.length / 2)
                    return arr[i];
            }
        }
        return -1;
    }

}
