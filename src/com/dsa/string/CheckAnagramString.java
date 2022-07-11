package com.dsa.string;

import java.util.Arrays;
public class CheckAnagramString {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "eHllo";
        System.out.println(check(s1, s2));
        System.out.println(checkAnagram(s1, s2));
    }

    // Time Complexity - O(nlogn)
    //Space Complexity - O(n)
    private static boolean checkAnagram(String s1, String s2) {
        if (s1.length() == s2.length()) {
            char c1[] = s1.toCharArray();
            char c2[] = s2.toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            return Arrays.equals(c1, c2);
        }
        return false;
    }

    // Time Complexity - O(n)
    private static boolean check(String s1, String s2) {
        int a[] = new int[256];
        for (int i = 0; i < s1.length(); i++) {
            a[s1.charAt(i)] = a[s1.charAt(i)] + 1;
        }
        for (int i = 0; i < s2.length(); i++) {
            a[s2.charAt(i)] = a[s2.charAt(i)] - 1;
        }
        for (int e : a) {
            if (e != 0)
                return false;
        }
        return true;
    }
}
