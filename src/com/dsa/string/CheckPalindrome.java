package com.dsa.string;

public class CheckPalindrome {
    public static void main(String[] args) {
        String s = "abba";
        //    check(s);
        System.out.println( isPalindromeEff(s));
    }

    // Time Complexity - O(n)
    private static boolean isPalindromeEff(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }

    // Time and space - O(n)
    private static void check(String s) {
        StringBuilder ss = new StringBuilder(s);
        ss.reverse();
        System.out.println(ss.toString().equals(s));
    }
}
