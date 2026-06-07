class Solution {
    public int maxProfit(int[] prices) {
        int pr=0;
        int min=prices[0];
        int max=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
            }
            pr=prices[i]-min;
            max=Math.max(pr,max);
        }
        return max;
    }
}
