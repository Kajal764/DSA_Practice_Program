package com.dsa.recursion;

public class CheckPalindromeString {
    public static void main(String[] args) {
        String s = "racecar";
        System.out.println(check(s, 0, s.length() - 1));
    }

    private static boolean check(String s, int start, int last) {
        if (start >= last)
            return true;
        if (s.charAt(start) != s.charAt(last))
            return false;
        return check(s, start + 1, last - 1);
    }
}
