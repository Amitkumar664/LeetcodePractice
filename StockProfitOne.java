public class StockProfitOne {

    public static int maxProfit(int[] prices) {
        int buyingPrice = Integer.MAX_VALUE; // minimum price so far
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            // If current price is higher, calculate profit
            if (buyingPrice < prices[i]) {
                int profit = prices[i] - buyingPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                // Update buying price (minimum so far)
                buyingPrice = prices[i];
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};

        int result = maxProfit(prices);
        System.out.println("Maximum Profit (Single Transaction): " + result);
    }
}