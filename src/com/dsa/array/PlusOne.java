package com.dsa.array;

class PlusOne {
    public static int[] plusOne(int[] digits) {
        int i = digits.length - 1;
        for (; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i] += 1;
                break;
            } else {
                digits[i] = 0;
            }
        }
        if (i == -1) {
            int[] newDigits = new int[digits.length + 1];
            newDigits[0] = 1;
            return newDigits;
        }
        return digits;
    }

//    public static int[] plusOne(int[] digits) {
//        addOne(digits, digits.length - 1);
//        if (digits[0] == 0) {
//            int[] newArr = new int[digits.length + 1];
//            newArr[0] = 1;
//            return newArr;
//        }
//        return digits;
//    }
//
//    public static void addOne(int[] arr, int index) {
//        if (index < 0) {
//            return;
//        }
//        arr[index]++;
//        if (arr[index] == 10) {
//            arr[index] = 0;
//            addOne(arr, index - 1);
//        }
//    }

    public static void main(String[] args) {
        int a[] = {9, 5};
        int res[] = plusOne(a);
        for (int d : res) {
            System.out.print(d + " ");
        }
    }
}
