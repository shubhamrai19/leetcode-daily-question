/*
You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 */
package com.bytecode.leetcodedailyquestion.day43;

public class BestTime_BuyStock {
    public int maxProfit(int[] prices) {
        int maxPro = 0, i= 0,j=1;

        while (j<prices.length){
            if (prices[j]<prices[i]){//{7,1,5,3,6,4}
                i=j;
                j++;
            }else {
                maxPro=Math.max(maxPro,prices[j]-prices[i]);
                j++;
            }
        }

        return maxPro;
    }
}
