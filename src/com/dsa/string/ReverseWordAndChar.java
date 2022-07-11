package com.dsa.string;

public class ReverseWordAndChar {
    public static void main(String[] args) {
        String s = "I am the boss";
        reverse(s);
    }

    private static void reverse(String s) {
        String wordsArray[] = s.split(" ");
        String reverseString = "";
        for (int i = wordsArray.length - 1; i >= 0; i--) {
            StringBuilder word = new StringBuilder(wordsArray[i]);
            reverseString += word.reverse() + " ";
        }
        System.out.println(reverseString);
    }

}

