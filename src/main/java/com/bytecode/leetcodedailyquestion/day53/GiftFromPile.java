/*
You are given an integer array gifts denoting the number of gifts in various piles. Every second, you do the following:

Choose the pile with the maximum number of gifts.
If there is more than one pile with the maximum number of gifts, choose any.
Leave behind the floor of the square root of the number of gifts in the pile. Take the rest of the gifts.
Return the number of gifts remaining after k seconds.
 */
package com.bytecode.leetcodedailyquestion.day53;

import java.util.Arrays;

public class GiftFromPile {
    public long pickGifts(int[] gifts, int k) {
        long giftRemaining = 0;
        int n = gifts.length;

        while (k > 0) {
            Arrays.sort(gifts);
            gifts[n - 1] = (int) Math.sqrt(gifts[n - 1]);
            k--;
        }
        for (int i : gifts) {
            giftRemaining += i;
        }
        return giftRemaining;
    }
}
