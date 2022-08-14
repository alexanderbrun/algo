package leet;

import java.util.Arrays;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
//        Input: prices = [7,1,5,3,6,4]
//        Output: 5
//        Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
//        Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
//        Example 2:
//
//        Input: prices = [7,6,4,3,1]
//        Output: 0
//        Explanation: In this case, no transactions are done and the max profit = 0.

        System.out.println(maxProfit(new int[] {7,1,5,3,6,4}));
        System.out.println(maxProfit(new int[] {7,6,4,3,1}));
    }

    public static int maxProfitNew(int[] prices) {
        int anchor = 0;
        int res = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < prices[anchor]) anchor = i;
            res = Math.max(prices[i] - prices[anchor], res);
        }
        return res;
    }

    public static int maxProfit(int[] prices) {
        int sellPrice = 0;

        int res = 0;

        int length = prices.length;

        for (int i = length - 1; i >= 0; i--) {
            int currPrice = prices[i];

            if (currPrice > sellPrice) {
                sellPrice = currPrice;
            } else if (sellPrice - currPrice > res) {
                res = sellPrice - currPrice;
            }
        }
        return res;
    }
}
