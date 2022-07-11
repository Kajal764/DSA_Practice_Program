package com.dsa.string;

public class ReverseWord {
    public static void main(String[] args) {
        String s = "I am the boss";
        reverse(s);
        reverse1(s);
        reverseEfficientWay(s);
    }

    // But it will use extra space
    // TC- O(n)
    private static void reverse(String s) {
        String wordsArray[] = s.split(" ");
        String reverseString = "";
        for (int i = wordsArray.length - 1; i >= 0; i--) {
            reverseString += wordsArray[i] + " ";
        }
        System.out.println(reverseString);
    }

    private static void reverse1(String s) {
        String wordsArray[] = s.split(" ");
        int l = 0;
        int r = wordsArray.length - 1;
        while (l < r) {
            String temp = wordsArray[l];
            wordsArray[l] = wordsArray[r];
            wordsArray[r] = temp;
            l++;
            r--;
        }
        String reverseString = "";
        for (String word : wordsArray) {
            reverseString += word + " ";
        }
        System.out.println(reverseString);
    }

    private static void reverseEfficientWay(String s) {
        char[] c = s.toCharArray();
        // Step 1- To reverse the char
        int start = 0;
        int end = 0;
        for (; end < s.length(); end++) {
            if (c[end] == ' ') {
                reverseChar(c, start, end - 1);
                start = end + 1;
            }
        }
        // For last word
        reverseChar(c, start, end - 1);

        //Step2 - reverse full string
        reverseChar(c, 0, s.length() - 1);
        System.out.println(String.valueOf(c));
    }

    private static void reverseChar(char[] s, int i, int j) {
        while (i < j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
    }
}
