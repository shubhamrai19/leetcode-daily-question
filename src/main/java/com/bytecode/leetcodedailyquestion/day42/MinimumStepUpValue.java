/*
Given an array of integers nums, you start with an initial positive value startValue.

In each iteration, you calculate the step by step sum of startValue plus elements in nums (from left to right).

Return the minimum positive value of startValue such that the step by step sum is never less than 1.
 */
package com.bytecode.leetcodedailyquestion.day42;

public class MinimumStepUpValue {
    public int minStartValue(int[] nums) {
        int startValue = 0, min = 0;
        for (int i : nums) {
            startValue += i;
            min = Math.min(min, startValue);
        }
        int re = 1 - min;
        return re;
    }
}
