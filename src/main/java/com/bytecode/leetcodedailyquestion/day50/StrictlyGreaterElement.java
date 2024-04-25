/*
Given an integer array nums, return the number of elements that have both a strictly smaller and a strictly greater element appear in nums.
 */
package com.bytecode.leetcodedailyquestion.day50;

import java.util.Arrays;

public class StrictlyGreaterElement {
    public int countElements(int[] nums) {
        int storePosition = 0;
        Arrays.sort(nums);
        for (int i=1;i<nums.length-1;i++){
            if (nums[i]>nums[0] && nums[i]<nums[nums.length-1]){
                storePosition++;
            }
        }
        return storePosition;
    }
}
