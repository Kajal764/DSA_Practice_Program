package com.dsa.math;

// Time complexity - Theta(d) - where d is num of digit from input no
public class Palindrome {

    public static void main(String[] args) {
        int num = 121;
        int temp = num;
        int reverseNo = 0;
        while (temp > 0) {
            int n = temp % 10;
            reverseNo = reverseNo * 10 + n;
            temp = temp / 10;
        }
        if (reverseNo == num)
            System.out.println("Given no is palindrome");
        else
            System.out.println("Given no is not palindrome");
    }
}
