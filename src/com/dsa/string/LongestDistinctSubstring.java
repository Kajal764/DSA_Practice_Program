package com.dsa.string;

import java.util.Arrays;

public class LongestDistinctSubstring {
    public static void main(String[] args) {
        String s = "abcdapqrst";
        System.out.println(longestDistinctWithO3(s));
        System.out.println(longestDistinctWithO2(s));
        System.out.println(longestDistinctWithOn(s.toCharArray()));
    }

    // Time C- O(n) better approach
    static int longestDistinctWithOn(char[] s) {
        int i = 0, j = 0;
        int index[] = new int[256];
        Arrays.fill(index, -1);
        int ans = 0;
        while(j < s.length) {
            int lastPos = index[s[j]];
            boolean isPresent = true;
            if(lastPos == -1 || lastPos < i) {
                isPresent = false;
            }
            if(isPresent) {
                i = lastPos+1;
            }
            int curWindoSize = j-i+1;
            ans = Math.max(ans, curWindoSize);
            index[s[j]] = j;
            j++;
        }
        return ans;
    }


    // TC - O(n2) - and uses extra space i time 256
    private static int longestDistinctWithO2(String str) {
        int max = 0;
        for (int i = 0; i < str.length(); i++) {
            boolean visited[] = new boolean[256];
            for (int j = i; j < str.length(); j++) {
                if (visited[str.charAt(j)] == true)
                    break;
                else {
                    max = Math.max(max, j - i + 1);
                    visited[str.charAt(i)] = true;
                }
            }
        }
        return max;
    }

    // Not so good , TC- O(n3)
    private static int longestDistinctWithO3(String str) {
        int max = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                if (areAllCharDistinct(str, i, j)) {
                    max = Math.max(max, j - i + 1);
                }
            }
        }
        return max;
    }

    private static boolean areAllCharDistinct(String str, int i, int j) {
        boolean visited[] = new boolean[256];
        for (int k = i; k <= j; k++) {
            if (visited[str.charAt(k)] == true)
                return false;
            visited[str.charAt(k)] = true;
        }
        return true;
    }
}
