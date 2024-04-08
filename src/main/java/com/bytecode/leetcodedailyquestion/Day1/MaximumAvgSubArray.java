/*
You are given an integer array nums consisting of n elements, and an integer k.
Find a contiguous subarray whose length is equal to k that has the maximum
average value and return this value.
 Any answer with a calculation error less than 10-5 will be accepted.
 */

package com.bytecode.leetcodedailyquestion.Day1;

public class MaximumAvgSubArray {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        for (int i = 0; i < k; i++)
            sum += nums[i];
        double avg = sum;
        for (int j = k; j < nums.length; j++) {
            sum += nums[j] - nums[j - k];
            avg = Math.max(avg, sum);

        }
        return avg / k;
    }
}
