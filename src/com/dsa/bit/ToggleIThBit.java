package com.dsa.bit;

public class ToggleIThBit {
    public static void main(String[] args) {
        int a = 9;
        System.out.println(toggle(9,1));
    }

    private static int toggle(int no, int i) {
        int mask = 1 << (i-1);
        int result = no ^ mask;
        return result;
    }
}
