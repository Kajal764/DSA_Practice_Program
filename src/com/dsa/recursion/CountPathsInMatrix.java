package com.dsa.recursion;

public class CountPathsInMatrix {
    public static void main(String[] args) {
        System.out.println(countPaths(2, 4));
    }

    private static int countPaths(int n, int m) {
        if (n == 1 || m == 1)
            return 1;
        int rightSidePath = countPaths(n, m - 1);
        int downSidePath = countPaths(n - 1, m);
        return rightSidePath + downSidePath;
    }
}
