package com.dsa.recursion;

public class SumOfNNo {
    public static void main(String[] args) {
            System.out.println(sumOfNNaturalNO(5));
    }

    private static int sumOfNNaturalNO(int no) {
        if (no == 0)
                return 0;
        return sumOfNNaturalNO(no - 1) + no;
    }
}
