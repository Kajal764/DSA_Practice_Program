package com.dsa.binarysearch;

public class SqrtOfNo {
    public static void main(String[] args) {
        System.out.println(find(15));
        System.out.println(squrtEfficient(15));
    }

    //log (x)- 16- 4 iteration
    private static int squrtEfficient(int x) {
        int low = 1, high = x, ans = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            int midSq = mid * mid;
            if (midSq == x) {
                return mid;
            } else if (midSq > x) {
                high = mid - 1;
            } else {
                // midSq < x
                low = mid + 1;
                ans = mid;
            }
        }
        return ans;
    }

    // theta(sqrt(x))- fixed
    private static int find(int x) {
        int i = 1;
        while (i * i <= x) {
            i++;
        }
        return i - 1;
    }
}
