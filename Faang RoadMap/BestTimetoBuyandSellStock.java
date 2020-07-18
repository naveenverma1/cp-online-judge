// link https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

class Solution {
    public int maxProfit(int[] prices) {
int maxcurr = 0;
        int n = prices.length;
        
        int maxsofar= 0;
        for(int  i=1;i<n;i++){
            maxcurr = Math.max(0,maxcurr+= prices[i]-prices[i-1]);
            maxsofar = Math.max(maxsofar,maxcurr);
        }
        return maxsofar;
    
}} 

// or ........................................................


class Solution {
    public int maxProfit(int[] prices) {
int max = 0;
        int n = prices.length;
int min = Integer.MAX_VALUE;
        for(int i =0;i<n;i++){
            if(prices[i]<min){
                min = prices[i];
                
            }else{
                max = Math.max(max,prices[i]-min);
            }
        }
        return max;

}}