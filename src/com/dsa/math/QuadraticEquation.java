package com.dsa.math;

public class QuadraticEquation {
    public static void main(String[] args) {
        double a = 2.3, b = 4, c = 5.6;
        double x1, x2;

        double D = b * b - 4 * a * c;
        if (D > 0) {
            x1 = (-b + Math.sqrt(D)) / 2 * a;
            x2 = (-b - Math.sqrt(D)) / 2 * a;
        } else if (D == 0) {
            x1=x2=-b/2*a;
        } else {
            double real= -b/2*a;
            double imaginary = Math.sqrt(-D) / (2 * a);
            System.out.format("root1 = %.2f+%.2fi", real, imaginary);
            System.out.format("\nroot2 = %.2f-%.2fi", real, imaginary);
        }
    }
}
