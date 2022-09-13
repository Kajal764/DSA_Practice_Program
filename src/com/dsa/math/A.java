package com.dsa.math;

public class A {
    int a = 5;

    public static void main(String[] args) {
        A a = new A();
        System.out.println(a);
        System.gc();
        System.out.println(a);
    }
}
