package com.dsa.recursion;

public class SubsetOfString {
    public static void main(String[] args) {
        generateAllSubset("abc");
    }

    private static void generateAllSubset(String s) {
        utilGenerateAllSubset(s, 0, "");
    }

    private static void utilGenerateAllSubset(String s, int i, String currentString) {
        if (i == s.length()) {
            System.out.print(currentString+"  ");
            return;
        }
        utilGenerateAllSubset(s, i + 1, currentString);
        utilGenerateAllSubset(s, i + 1, currentString + s.charAt(i));
    }
}
