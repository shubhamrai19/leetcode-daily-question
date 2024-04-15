/*
You are given a non-negative integer array nums. In one operation, you must:

Choose a positive integer x such that x is less than or equal to the smallest non-zero element in nums.
Subtract x from every positive element in nums.
Return the minimum number of operations to make every element in nums equal to 0.
 */
package com.bytecode.leetcodedailyquestion.day40;

import java.util.Arrays;

public class MakeArray_0 {
    public int minimumOperations(int[] nums) {
        Arrays.sort(nums);
        int xx = 0;
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            if (x != 0) {
                for (int j = i; j < nums.length; j++) {
                    nums[j] = nums[j] - x;
                }
                xx++;
            }
            if(nums[nums.length-1]==0){
                break;
            }
        }
        return xx;
    }
}
