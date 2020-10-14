package core;

import java.util.List;

public class _07_BuyAndSellStockOnce {

    public static int maxProfit(int[] prices) {

        if (prices.length == 0) {
            return 0;
        }

        int min = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = prices.length; i < prices.length; i++) {
            maxProfit = Math.max(maxProfit, prices[i] - min);
            min = Math.min(min, prices[i]);
        }
        return maxProfit;
    }

  

    public static void main(String[] args) {

        int[] arr = { 310, 310, 275, 275, 260, 260, 260, 230, 230, 230 };
        int result = maxProfit(arr);
        System.out.println(result);

    }

}
