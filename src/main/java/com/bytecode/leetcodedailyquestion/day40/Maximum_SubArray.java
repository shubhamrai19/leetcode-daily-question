/*
Given an integer array nums, find the
subarray
 with the largest sum, and return its sum.
 */
package com.bytecode.leetcodedailyquestion.day40;

public class Maximum_SubArray {
    public int maxSubArray(int[] nums) {
        int prevSum = 0, currSum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            prevSum += nums[i];
            currSum = Math.max(prevSum, currSum);
            if (prevSum < 0) {
                prevSum = 0;
            }

        }
        return currSum;
    }
}
