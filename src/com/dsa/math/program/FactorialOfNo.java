package com.dsa.math.program;

public class FactorialOfNo {

    public static void main(String[] args) {
        System.out.println(  getFactorialOfNo(4));
    }

//    private static int getFactorialOfNo(int no) {
//        // 4 - 1* 2 * 3 * 4 = 24
//        int total = 1;
//        for (int i = 2; i <= no; i++) {
//            total = total * i;
//        }
//        return total;
//    }

    private static int getFactorialOfNo(int no) {
        if (no == 0)
            return 1;
        return no * getFactorialOfNo(no - 1);
    }
}
