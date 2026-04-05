class Solution {
    public int maxProfit(int[] prices) {
        int i=0;
        int max=0;
        for(int j=0;j<prices.length;j++){
            prices[i]=Math.min(prices[i], prices[j]);

            int sum=prices[j]-prices[i];
            max=Math.max(max, sum);
        }
        return max;
    }
}
