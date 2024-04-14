/*
Given an array of integers arr, a lucky integer is an integer that has a
frequency in the array equal to its value.

Return the largest lucky integer in the array. If there is no lucky integer return -1.
 */
package com.bytecode.leetcodedailyquestion.Day39;

import java.util.HashMap;

public class LuckyInteger {
    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        int maxFreq = -1;
        for (int i : arr) {
            if (map.get(i) == i && i > maxFreq) {
                maxFreq = i;
            }
        }

        return maxFreq;
    }
}
