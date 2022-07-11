package com.dsa.string;

// Naive way
public class PatternMatching {
    public static void main(String[] args) {
        String s = "abcabdabbacbdabda";
        String p = "bda";
        findSubString(s, p);
    }

    private static void findSubString(String s, String p) {
        int n = s.length();
        int m = p.length();
        for (int i = 0; i <= n - m; i++) {
            int j = 0;
            for (; j < m; j++) {
                // i+j = so that next element will check instead of previous one
                if (s.charAt(i + j) != p.charAt(j))
                    break;
            }
            if (j == m)
                System.out.println("Pattern found at " + i);
        }
    }

    // Improved naive algorithm for distinct pattern match
    // Time com - theta(n)
    private static void findSubStringForDistinctPattern(String s, String p) {
        int n = s.length();
        int m = p.length();
        for (int i = 0; i <= n - m; ) {
            int j = 0;
            for (; j < m; j++) {
                // i+j = so that next element will check instead of previous one
                if (s.charAt(i + j) != p.charAt(j))
                    break;
            }
            if (j == m)
                System.out.println("Pattern found at " + i);
            if (j == 0)
                i++;
            else
                i = (i + j);
            // so here if ex out of 4 , 3 characters match then
            // instead of iterating again to next element will start iterating
            // from the element which not match
        }
    }
}
