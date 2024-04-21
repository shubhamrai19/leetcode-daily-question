/*
Given an array of positive integers nums, return the maximum possible sum of an ascending subarray in nums.

A subarray is defined as a contiguous sequence of numbers in an array.

A subarray [numsl, numsl+1, ..., numsr-1, numsr] is ascending if for all i where l <= i < r, numsi  < numsi+1. Note that a subarray of size 1 is ascending.


 */
package com.bytecode.leetcodedailyquestion.day46;

public class MaxSum_AscendingSubArr {
    public int maxAscendingSum(int[] nums) {
        int sum = 0;
        int maxSum = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]){
                sum += nums[i];
            }
            else {
                sum += nums[i];
                maxSum = Math.max(maxSum, sum);
                sum = 0;
            }
        }
        sum += nums[nums.length - 1];
        maxSum = Math.max(sum, maxSum);
        return maxSum;
    }
}
