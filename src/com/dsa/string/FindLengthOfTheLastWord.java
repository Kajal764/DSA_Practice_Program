package com.dsa.string;

public class FindLengthOfTheLastWord {
    public static void main(String[] args) {
        String s = "I am the boss";
        find(s);
        System.out.println(lengthOfLastWord(s));
    }

    private static void find(String s) {
        String s1 = s.trim();
        int length = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == ' ') {
                length = 0;
            } else {
                length++;
            }
        }
        System.out.println(length);
    }

    public static int lengthOfLastWord(final String a)
    {
        boolean char_flag = false;
        int len = 0;
        for (int i = a.length() - 1; i >= 0; i--) {
            if (Character.isLetter(a.charAt(i))) {
                // Once the first character from last
                // is encountered, set char_flag to true.
                char_flag = true;
                len++;
            }
            else {
                // When the first space after the characters
                // (from the last) is encountered, return the
                // length of the last word
                if (char_flag == true)
                    return len;
            }
        }
        return len;
    }
}
