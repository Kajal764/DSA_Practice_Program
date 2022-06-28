package com.dsa.recursion;

public class Print_N_naturalNo {

    public static void main(String[] args) {
        printNNaturalNo(5);
    }

    private static void printNNaturalNo(int no) {
        if(no ==0)
            return;
        printNNaturalNo(no-1);
        System.out.println(no);
    }

//    private static void printNNaturalNo(int no) {
//        if(no ==0)
//            return;
//        System.out.println(no);
//        printNNaturalNo(no-1);
//    }
}
