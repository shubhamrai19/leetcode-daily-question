/*
It is a sweltering summer day, and a boy wants to buy some ice cream bars.

At the store, there are n ice cream bars. You are given an array costs of length n,
 where costs[i] is the price of the ith ice cream bar in coins. The boy initially has
 coins coins to spend, and he wants to buy as many ice cream bars as possible.

Note: The boy can buy the ice cream bars in any order.

Return the maximum number of ice cream bars the boy can buy with coins coins.
 */

package com.bytecode.leetcodedailyquestion.Day39;

import java.util.Arrays;

public class MaximumIcecream {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int count = 0;
        for (int i = 0; i < costs.length; i++) {
            if (coins >= costs[i]) {
                coins = coins - costs[i];
                count++;
            } else {
                return count;
            }

        }
        return count;
    }
}
