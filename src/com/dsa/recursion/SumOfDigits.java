package com.dsa.recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(findSum(1234));
    }
    private static int findSum(int no) {
        if (no == 0)
            return 0;
        int lastDigit=no % 10;
        return lastDigit + findSum(no / 10);
    }
}
