/*
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.


 */
package com.bytecode.leetcodedailyquestion.day51;

public class MoveZero {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[counter] = nums[i];
                counter++;
            }
        }
        for (int j = counter; j < nums.length; j++) {
            nums[j] = 0;
        }

    }
}
