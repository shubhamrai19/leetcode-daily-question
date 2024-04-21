/*
You are given a 0-indexed integer array nums having length n, an integer indexDifference, and an integer valueDifference.

Your task is to find two indices i and j, both in the range [0, n - 1], that satisfy the following conditions:

abs(i - j) >= indexDifference, and
abs(nums[i] - nums[j]) >= valueDifference
Return an integer array answer, where answer = [i, j] if there are two such indices, and answer = [-1, -1] otherwise. If there are multiple choices for the two indices, return any of them.

Note: i and j may be equal.
 */

package com.bytecode.leetcodedailyquestion.day46;

import java.util.Arrays;

public class IndexValueDifference {
    public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
        int arr[] = {-1, -1};
        for (int i = 0; i < nums.length - indexDifference; i++) {
            for (int j=i+indexDifference;j<nums.length;j++) {
                if (Math.abs(i - j) >= indexDifference && Math.abs(nums[i] - nums[j]) >= valueDifference) {
                    arr[0] = i;
                    arr[1] = j;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
        return arr;
    }
}
