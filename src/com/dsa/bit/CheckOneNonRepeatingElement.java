package com.dsa.bit;

public class CheckOneNonRepeatingElement {
    public static void main(String[] args) {
        int a[] = {2, 3, 4, 1, 5, 2, 3, 1, 4};
        System.out.println(check(a));
    }
    private static int check(int[] a) {
        int res = 0;
        for (int i : a) {
            res = res ^ i;
        }
        return res;
    }
}
