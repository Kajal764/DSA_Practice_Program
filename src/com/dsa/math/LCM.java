package com.dsa.math;

// LCM can be greater than the max no of (a,b) till a*b
public class LCM {
    public static void main(String[] args) {
        System.out.println(naiveWay(15, 10));
        System.out.println(efficientWay(15, 10));
    }

    // WIll use formula
    // a*b= gcd(a,b) * lcm(a,b)
    //lcm(a,b)= a*b /gcd(a,b)
    // Time Complexity - log(min(a,b)) - as gcd time complexity
    private static int efficientWay(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    //Time Complexity - O(a*b)
    private static int naiveWay(int a, int b) {
        int result = Math.max(a, b);
        while (result != a * b) {
            if (result % a == 0 && result % b == 0) {
                return result;
            }
            result++;
        }
        return result;
    }
}
