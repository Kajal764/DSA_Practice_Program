package com.dsa.string;

public class LeftMostRepeatingChar {
    public static void main(String[] args) {
        String s = "Geeks";
        System.out.println(findLeftMostChar(s));
        System.out.println(betterApproach(s));
        System.out.println(efficientApproach(s));
    }

    // Instead of two for loops its one loop
    // O(n)
    private static int efficientApproach(String s) {
        boolean vistited[] = new boolean[256];
        int res = -1;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (vistited[s.charAt(i)])
                res = i;
            else
                vistited[s.charAt(i)] = true;
        }
        return res;
    }

    // Time complexity - O(n)
    // Space complexity - O(256)
    private static int betterApproach(String s) {
        char[] chars = new char[256];
        for (int i = 0; i < s.length(); i++) {
            chars[s.charAt(i)]++;
        }
        // to find leftmost we need to complete loop and then search if frequency is greater or not
        for (int i = 0; i < s.length(); i++) {
            if (chars[s.charAt(i)] > 1)
                return i;
        }
        return -1;
    }

    //Time Complexity - (n2)
    private static int findLeftMostChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j))
                    return i;
            }
        }
        return -1;
    }
}
