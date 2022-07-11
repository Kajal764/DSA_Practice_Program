package com.dsa.string;

import java.util.Arrays;

public class LeftmostNonRepeatingElement {
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        System.out.println(find(s));
        System.out.println(nonRepeatingChar(s));
        System.out.println(nonRepeatingCharEfficientWay(s));
    }

    // TC - O(n)
    // Space - O(constant) - here we have one loop and another is constant loop
    // so that is constant every time eventhough we have large no
    private static int nonRepeatingCharEfficientWay(String s) {
        int f[] = new int[256];
        Arrays.fill(f, -1);
        for (int i = 0; i < s.length(); i++) {
            if (f[s.charAt(i)] == -1)
                f[s.charAt(i)] = i;
            else
                f[s.charAt(i)] = -2;
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < f.length; i++) {
            if (f[i] >= 0)
                min = Math.min(min, f[i]);
        }
        return (min == Integer.MAX_VALUE) ? -1 : min;
    }

    // Tc, - O(n) , space - 256
    private static int nonRepeatingChar(String s) {
        char count[] = new char[256];
        for (int i = 0; i < s.length(); i++)
            count[s.charAt(i)]++;
        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i)] == 1)
                return i;
        }
        return -1;
    }

    // Time C- O(n2)
    private static int find(String s) {
        for (int i = 0; i < s.length(); i++) {
            boolean flag = false;
            for (int j = 0; j < s.length(); j++) {
                if (i != j && s.charAt(i) == s.charAt(j)) {
                    flag = true;
                    break;
                }
            }
            if (flag == false)
                return i;
        }
        return -1;
    }
}
