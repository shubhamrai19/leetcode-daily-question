/*
You are given a 0-indexed integer array nums, and an integer k.

In one operation, you can remove one occurrence of the smallest element of nums.

Return the minimum number of operations needed so that all elements of the array
are greater than or equal to k.
 */
package com.bytecode.leetcodedailyquestion.Day38;

import java.util.Arrays;

public class MinOperation {
    public int minOperations(int[] nums, int k) {
        int count=0;
        Arrays.sort(nums);

        for (int i:nums){
            if (i<k){
                count++;
            }else {
                break;
            }
        }
        return count;
    }

}
