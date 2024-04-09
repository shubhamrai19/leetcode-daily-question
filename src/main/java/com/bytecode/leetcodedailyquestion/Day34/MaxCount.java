/*
You are given an array nums consisting of positive integers.

Return the total frequencies of elements in nums such that those elements all have
 the maximum frequency.

The frequency of an element is the number of occurrences of that element in the array.
 */

package com.bytecode.leetcodedailyquestion.Day34;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MaxCount {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        int maxValueInMap = (Collections.max(map.values()));
            int max=0;
        for (Map.Entry<Integer, Integer> entry :
                map.entrySet()) {
            if (entry.getValue() == maxValueInMap) {
                max = entry.getValue();
            }
        }
            int count=0;
            for (Map.Entry<Integer, Integer> entry :
                    map.entrySet()) {
                if (entry.getValue() == max) {
                    count += max;
                }
            }
        return count;

    }
}
