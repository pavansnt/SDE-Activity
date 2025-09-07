public class BuySell {
    public static int StockBuySell(int[] prices)
    {
       int buy_price = Integer.MAX_VALUE;
       int Max_profit = 0;
       int profit;

       for( int i=0; i<prices.length;i++)
       {
            if(buy_price < prices[i])
            {
                profit = prices[i] - buy_price ;
                Max_profit = Math.max(Max_profit, profit);
            }
            else
            {
                buy_price = prices[i];
            }
       }
       return Max_profit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(StockBuySell(prices));
    }
}
