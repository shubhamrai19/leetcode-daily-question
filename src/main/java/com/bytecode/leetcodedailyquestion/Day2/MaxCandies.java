/*
There are n kids with candies. You are given an integer array candies,
 where each candies[i] represents the number of candies the ith kid has,
 and an integer extraCandies, denoting the number of extra candies that you have.

Return a boolean array result of length n, where result[i] is true if,
after giving the ith kid all the extraCandies, they will have the greatest
number of candies among all the kids, or false otherwise.

Note that multiple kids can have the greatest number of candies.
 */

package com.bytecode.leetcodedailyquestion.Day2;

import java.util.ArrayList;
import java.util.List;

public class MaxCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> retOuput = new ArrayList<Boolean>(candies.length);
        int max = Integer.MIN_VALUE;

        for (int j=0;j<candies.length;j++) {
            if (candies[j] > max) {
                max = candies[j];
            }
        }
        for (int i = 0; i < candies.length; i++) {
            candies[i]+=extraCandies;

            if (candies[i]<max){
                retOuput.add(false);
            }else {
                retOuput.add(true);
            }
        }
        return retOuput;
    }
}
