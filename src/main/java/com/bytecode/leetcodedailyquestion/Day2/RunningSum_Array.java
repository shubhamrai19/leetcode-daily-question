/*
Given an array nums. We define a running sum of an array as
runningSum[i] = sum(nums[0]…nums[i]).

Return the running sum of nums.
 */

package com.bytecode.leetcodedailyquestion.Day2;

public class RunningSum_Array {
    public int[] runningSum(int[] nums) {
        int[] arraySum = new int[nums.length];
        int toStoreSum = 0;
        int sumzero = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                arraySum[i] = nums[i];
            } else {
                toStoreSum = toStoreSum + nums[i - 1];
                arraySum[i] = toStoreSum + nums[i];
            }
        }

        return arraySum;
    }
}
