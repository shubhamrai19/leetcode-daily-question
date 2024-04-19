/*
Given a 0-indexed integer array nums, find the leftmost middleIndex (i.e., the smallest amongst all the possible ones).

A middleIndex is an index where nums[0] + nums[1] + ... + nums[middleIndex-1] == nums[middleIndex+1] + nums[middleIndex+2] + ... + nums[nums.length-1].

If middleIndex == 0, the left side sum is considered to be 0. Similarly, if middleIndex == nums.length - 1, the right side sum is considered to be 0.

Return the leftmost middleIndex that satisfies the condition, or -1 if there is no such index.
 */
package com.bytecode.leetcodedailyquestion.day44;

public class MiddleSum {
    public int findMiddleIndex(int[] nums) {
        int m = 0;

        for (int i = 0; i < nums.length; i++) {
            int l = left(nums, i);
            int r = right(nums, i);

            if (l == r) {
                return i;
            }
        }
        return m;
    }

    public int left(int arr[], int end) {
        int lsum = 0;

        for (int i = 0; i < end; i++) {
            lsum += arr[i];
        }
        return lsum;
    }

    public int right(int arr[], int start) {
        int rsum = 0;

        for (int i = start + 1; i < arr.length; i++) {
            rsum += arr[i];
        }
        return rsum;
    }

}
