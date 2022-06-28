package com.dsa.recursion;

public class PowerOfNo {
    public static void main(String[] args) {
        System.out.println(powerOfNo(3, 4));
    }

    private static int powerOfNo(int a, int b) {
        if(b==0) {
            return 1;
        }
        return powerOfNo(a, b - 1) * a;
    }
}
