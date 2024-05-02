/*
Given an array of integers nums, calculate the pivot index of this array.

The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.

If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.

Return the leftmost pivot index. If no such index exists, return -1.
 */
package com.bytecode.leetcodedailyquestion.day57;

public class PivotIndex {
    public int pivotIndex(int[] nums) {
        int leftSum = 0;
        int tSum = 0;
        for (int i : nums) {
            tSum += i;
        }

        for (int i = 0; i < nums.length; i++) {
            tSum -= nums[i];

            if (leftSum == tSum) {
                return i;
            }

            leftSum += nums[i];
        }

        return -1;
    }
}
