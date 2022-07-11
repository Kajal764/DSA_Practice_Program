package com.dsa.bit;

public class ReverseTheBits {
    public static void main(String[] args) {
        long n = 3;
        System.out.println(reverse(3));
    }

    static long reverse(long n) {
        long res = 0;
        int i = 0;
        while (i <= 31) {
            if ((n & (1 << i)) != 0)
                res += (1L << (31-i));
            // use 1L instead of one bcoz while xor it was considered as int
            // and 31th postition is 1 then it considered negavtive no
            // to to give positive ans we use 1L
            i++;
        }
        return res;
    }
}
