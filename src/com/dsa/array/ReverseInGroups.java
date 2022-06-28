package com.dsa.array;

import java.util.ArrayList;

public class ReverseInGroups {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        reverseInGroups(arr, 5, 3);
    }

    static void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        for (int i = 0; i < n; i = i + k) {
            int low = i;
            int high = Math.min(i + k - 1, n - 1);

            while (low < high) {
                int temp = arr.get(low);
                arr.set(low, arr.get(high));
                arr.set(high, temp);
                low++;
                high--;
            }
        }
        for (int i=0;i< arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
    }

}
