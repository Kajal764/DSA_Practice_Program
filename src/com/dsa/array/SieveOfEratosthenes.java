package com.dsa.array;

import java.util.Arrays;

// This program will calculate how many factorials exists till the given no
public class SieveOfEratosthenes {

    public static void main(String[] args) {
        boolean[] primeArray = getPrimeNo(12);
        for (int i = 0; i < primeArray.length; i++) {
            if (primeArray[i] == true)
                System.out.println(i);
        }
    }

    private static boolean[] getPrimeNo(int no) {
        boolean[] isPrime = new boolean[no + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i * i <= no; i++) {
            for (int j = 2 * i; j <= no; j += i) {
                isPrime[j] = false;
            }
        }
        return isPrime;
    }

}
