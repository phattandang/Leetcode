class Solution {
    public int maxProfit(int[] prices) {
        int left = 0;
        int right = 0;
        int max = 0;
        for(int i = 0; i < prices.length; i++) {
            if(prices[right] - prices[left] > 0) {
                max = Math.max(max, prices[right] - prices[left]);
            } else {
                left = right;
            }
            right++;
        }
        return max;
    }
}
