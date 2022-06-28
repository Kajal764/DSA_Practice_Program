package com.dsa.array;

public class StockAndBuy {

    public static void main(String args[]) {
        int arr[] = {1, 5, 3, 8, 12, 79};
        //   System.out.println(maxProfit(arr, 0, arr.length - 1));
        System.out.println(maxProfitEfficientWay(arr, arr.length));

    }

    //Time Complexity - O(n)
    // Here every time we will calculate the profit which is going higher
    private static int maxProfitEfficientWay(int[] price, int length) {
        int profit = 0;
        for (int i = 1; i < price.length; i++) {
            if (price[i] > price[i - 1]) {
                profit += (price[i] - price[i - 1]);
            }
        }
        return profit;
    }

    static int maxProfit(int price[], int start, int end) {
        if (end <= start)
            return 0;
        int profit = 0;

        for (int i = start; i < end; i++) {
            for (int j = i + 1; j <= end; j++) {
                if (price[j] > price[i]) {
                    int curr_profit = price[j] - price[i]
                            + maxProfit(price, j + 1, end);
                    profit = Math.max(profit, curr_profit);
                }
            }
        }
        return profit;
    }


}
