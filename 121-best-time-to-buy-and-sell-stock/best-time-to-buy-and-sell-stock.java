class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        if(n<2){
            return 0;
        }
        int first=prices[0];
        int max=Integer.MIN_VALUE;
        for(int i=1;i<n;i++){
            first=Math.min(first,prices[i]);
            max=Math.max(max,prices[i]-first);
        }
        return max;
    }
}