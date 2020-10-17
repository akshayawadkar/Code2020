

import java.util.*;

public class _08_BuyAndSellStockTwice {

    public static void main(String[] args) {

        int[] arr = { 12, 11, 13, 9, 12, 8, 14, 13, 15 };

        int maxProfit = solve(arr);
        System.out.println(maxProfit);

    }

    private static int solve(int[] arr) {

        int maxProfit = 0;
        int min = Integer.MAX_VALUE;
        List<Integer> tmp = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
            maxProfit = Math.max(maxProfit, arr[i] - min);
            tmp.add(maxProfit);
        }

       
        int max = Integer.MIN_VALUE;
        for(int i = arr.length - 1; i > 0; i--){
            max = Math.max(max, arr[i]);
            maxProfit = Math.max(maxProfit, max - arr[i] + tmp.get(i - 1));
        }

        System.out.println(tmp);
        return maxProfit;
    }

}
