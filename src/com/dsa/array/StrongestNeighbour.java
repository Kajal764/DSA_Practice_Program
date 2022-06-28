package com.dsa.array;

public class StrongestNeighbour {

    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 3, 4, 5};
        maximumAdjacent(6, arr);
    }

    static void maximumAdjacent(int sizeOfArray, int arr[]) {

        for(int i=0;i<arr.length-1;i++)
        {
            int max=Math.max(arr[i],arr[i+1]);
            System.out.print(max+" ");
        }

//        for (i = 0; i < sizeOfArray - 1; i++) {
//            arr[i] = arr[i] > arr[i + 1] ? arr[i] : arr[i + 1];
//        }
//        arr[i] = 0;
//        for (int j : arr) {
//            System.out.print(j + " ");
//        }
    }
}
