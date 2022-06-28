package com.dsa.math.program;
//        a(n)=a(1)+(n-1)d
//        a(n)=the nᵗʰ term in the sequence
//        a(1)=the first term in the sequence
//        d=the common difference between terms

public class ArithmeticProgression {
    public static void main(String[] args) {
        int a = 2, d = 2, n = 5;
        printAP(a, d, n);
    }

    private static void printAP(int a, int d, int n) {
        for (int i = 1; i <= n; i++) {
            int term = a + (i - 1) * d;
            System.out.print(term + " ");
        }
    }

    public static class TrailingZeros {
        public static void main(String[] args) {
            findTrailingZeros(30);
        }
        private static void findTrailingZeros(int no) {
            int res=0;
            for (int i=5; i<=no ;i=i*5){
                res=res+no/i;
            }
            System.out.println("res = " + res);
        }
    }
}
