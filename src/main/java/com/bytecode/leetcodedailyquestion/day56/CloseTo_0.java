/*
Given an integer array nums of size n, return the number with the value closest to 0 in nums. If there are multiple answers, return the number with the largest value.
 */
package com.bytecode.leetcodedailyquestion.day56;

import java.util.Arrays;

public class CloseTo_0 {
    public int findClosestNumber(int[] nums) {
        Arrays.sort(nums);
        int res = 0;
        int value = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                return 0;
            }
            if (nums[i] > 0) {
                res = nums[i];
                break;
            }
            value = nums[i];

        }
        if (res == 0)
            return nums[nums.length - 1];
        if (Math.abs(value) < res)
            return value;

        return res;
    }
}
