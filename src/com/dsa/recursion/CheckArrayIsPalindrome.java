package com.dsa.recursion;

public class CheckArrayIsPalindrome {
    public static void main(String[] args) {
        int arr[] = {3, 6, 0, 6, 3};
        if (check(arr, 0, arr.length - 1)==1)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

    }

    private static int check(int[] arr, int start, int end) {
        if (start == end)
            return 1;
        if (arr[start] == arr[end]) {
            return check(arr, start + 1, end - 1);
        } else
            return 0;
    }
}
