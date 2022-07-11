package com.dsa.array;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverseWord("Geeks"));
    }

    public static String reverseWord(String str) {
        String s = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            s = s + str.charAt(i);
        }
        return s;
        //     char a[]=str.toCharArray();
        //     int start=0;
        // int end=a.length-1;
        // while(start < end){
        //     char temp=a[start];
        //     a[start]=a[end];
        //     a[end]=temp;
        //     start++;
        //     end--;
        // }
        //     return String.copyValueOf(a);
    }
}
