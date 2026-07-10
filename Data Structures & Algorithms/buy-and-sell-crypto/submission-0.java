class Solution {
    public int maxProfit(int[] prices) {
        int minbuy=prices[0];
        int maxp=0;
        for(int i:prices){
            maxp=Math.max(maxp,i-minbuy);
            minbuy=Math.min(i, minbuy);
        }
        return maxp;
    }
}
