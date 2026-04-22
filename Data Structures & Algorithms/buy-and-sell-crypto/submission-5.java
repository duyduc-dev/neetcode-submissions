class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
    int n = prices.length;

    int l = 0;
    int r = 1;

    while (r < n) {
      int buy = prices[l];
      int sell = prices[r];

      if (sell > buy) {
        int profit = sell - buy;
        if (profit > max) {
          max = profit;
        } 
      }else {
          l = r;
        }

      r++;
    }

    return max;
    }
}
