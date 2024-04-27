/*
Given a 2D integer array nums where nums[i] is a non-empty array of distinct positive integers, return the list of integers that are present in each array of nums sorted in ascending order.
 */
package com.bytecode.leetcodedailyquestion.day52;

import java.util.ArrayList;
import java.util.List;

public class ArrayIntersection {
    public List<Integer> intersection(int[][] nums) {
        int freq[] = new int[1001];
        int len = nums.length;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                freq[nums[i][j]]++;
            }
        }

        List<Integer> list = new ArrayList<>();

        for (int i = 1; i < 1001; i++) {
            if (freq[i] == len)
                list.add(i);
        }
        return list;
    }
}
