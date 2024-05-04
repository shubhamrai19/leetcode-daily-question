/*
Given a non-empty array of non-negative integers nums, the degree of this array is defined as the maximum frequency of any one of its elements.

Your task is to find the smallest possible length of a (contiguous) subarray of nums, that has the same degree as nums
 */
package com.bytecode.leetcodedailyquestion.day59;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Degree_Array {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : nums) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }

        int count = 0;
        for (int i : nums) {
            int x = map.get(i);
            count = Math.max(count, x);
        }

        HashMap<Integer, Integer> map1 = new HashMap<>();
        int windowSize = Integer.MIN_VALUE;
        int res = Integer.MAX_VALUE;
        int i = 0, j = 0;
        while (j < nums.length) {
            map1.put(nums[j], map1.getOrDefault(nums[j], 0) + 1);
            windowSize = Math.max(windowSize, map1.get(nums[j]));

            while (windowSize == count) {
                res = Math.min(res, j - i + 1);
                map1.put(nums[i], map1.getOrDefault(nums[i], 0) - 1);
                if (map1.get(nums[i]) == 0) {
                    map1.remove(nums[i]);
                }
                if (nums[i] == nums[j]) {
                    windowSize--;
                }
                i++;
            }
            j++;
        }

        return res;
    }
}
