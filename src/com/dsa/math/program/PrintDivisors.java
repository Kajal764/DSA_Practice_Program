package com.dsa.math.program;

public class PrintDivisors {
    public static void main(String[] args) {
        printDivisorsInSortingOrder(36);
    }

    private static void printDivisors(int n) {
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
                // If condition bcox 25= 5* 5 so 5 was repeated to avoid that use if
                if (n / i == i)
                    System.out.println(n / i);
            }
        }
    }

    private static void printDivisorsInSortingOrder(int n) {
        int i = 1;
        for (; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
        i--;
        for (; i >= 1; i--) {
            if (n % i == 0) {
                if (n / i != i)
                    System.out.print(n / i + " ");
            }
        }

    }
}

// Time Complexity - theta (root (n))
