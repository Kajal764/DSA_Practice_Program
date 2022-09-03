package com.dsa.math;

public class GCD {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        System.out.println(gcdNaiveWay(a, b));
        System.out.println(euclideanAlgo(a, b));
        System.out.println(euclideUsingRecursion(a, b));
    }

    private static int euclideUsingRecursion(int a, int b) {
        // here we will consider b is small
        if (b == 0)
            return a;
        return euclideUsingRecursion(b, a % b);
    }

    //This algo state that , let b is smaller than a
    //gcd(a,b)= gcd(a-b,b)
    private static int euclideanAlgo(int a, int b) {
        while (a != b) {
            if (a < b)
                b = b - a;
            else
                a = a - b;
        }
        return a;
    }

    //Time Complexity - O(min(a,b))
    private static int gcdNaiveWay(int a, int b) {
        int result = Math.max(a, b);
        while (result > 0) {
            if (a % result == 0 && b % result == 0) {
                break;
            }
            result--;
        }
        return result;
    }


}
