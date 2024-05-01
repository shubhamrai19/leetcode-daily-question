/*
You are given a 0-indexed integer array nums.

Return the maximum value over all triplets of indices (i, j, k) such that i < j < k. If all such triplets have a negative value, return 0.

The value of a triplet of indices (i, j, k) is equal to (nums[i] - nums[j]) * nums[k].
 */
package com.bytecode.leetcodedailyquestion.day56;

public class MaximumTriplets {
    public long maximumTripletValue(int[] nums) {
        int n = nums.length;

        long result = 0;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                if (nums[i] > nums[j]) {
                    for (int k = j + 1; k < n; k++) {
                        result = Math.max(result, ((long) nums[i] - (long) nums[j]) * nums[k]);
                    }
                }
            }
        }

        return result;
    }
}
