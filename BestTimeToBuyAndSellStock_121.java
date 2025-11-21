// LeetCode 121: Best Time to Buy and Sell Stock
// Approach: Track the minimum price seen so far and compute max profit on each day.
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int profit = 0;
        for(int price: prices){
            if(price<min){
                min=price;
            }else if(price-min>profit){
                profit=price-min;
            }
        }
        return profit;
    }
}
