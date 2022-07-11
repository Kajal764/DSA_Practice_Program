package com.dsa.string;

public class CheckSubString {
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "ad";
        System.out.println(check(s1, s2));
        System.out.println(checkRecursiveWay(s1, s2, s1.length(), s2.length()));
    }

    private static boolean check(String s1, String s2) {
        if (s2.length() > s1.length())
            return false;
        int i = 0;
        int j = 0;
        for (; i < s1.length() && j < s2.length(); i++) {
            if (s1.charAt(i) == s2.charAt(j))
                j++;
        }
        if (j == s2.length()) {
            return true;
        }
        return false;
    }

    // Time complexity O(min(m,n))
    // Space O(min(m,n)
    private static boolean checkRecursiveWay(String s1, String s2, int n, int m) {
        if (m == 0)
            return true;
        if (n == 0)
            return false;
        if (s1.charAt(n - 1) == s2.charAt(m - 1))
            return checkRecursiveWay(s1, s2, n - 1, m - 1);
        else
            return checkRecursiveWay(s1, s2, n - 1, m);
    }



}

//Time complexity - O(min(m,n))
