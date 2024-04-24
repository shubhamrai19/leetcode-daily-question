/*
You are given a 0-indexed 2D integer array nums representing the coordinates of the cars parking on a number line. For any index i, nums[i] = [starti, endi] where starti is the starting point of the ith car and endi is the ending point of the ith car.

Return the number of integer points on the line that are covered with any part of a car.
 */

package com.bytecode.leetcodedailyquestion.day49;

import java.util.HashSet;
import java.util.List;

public class IntersectWithCar {
    public int numberOfPoints(List<List<Integer>> nums) {
        HashSet<Integer> st1 = new HashSet<>();
        for (List<Integer> ls:nums) {
            for (int j = ls.getFirst(); j <= ls.getLast(); j++) {
                st1.add(j);
            }
        }

        return st1.size();

    }
}
