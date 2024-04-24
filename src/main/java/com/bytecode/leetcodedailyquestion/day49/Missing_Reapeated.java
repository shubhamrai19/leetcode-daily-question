/*
You are given a 0-indexed 2D integer matrix grid of size n * n with values in the range [1, n2]. Each integer appears exactly once except a which appears twice and b which is missing. The task is to find the repeating and missing numbers a and b.

Return a 0-indexed integer array ans of size 2 where ans[0] equals to a and ans[1] equals to b.
 */
package com.bytecode.leetcodedailyquestion.day49;

import java.util.HashSet;
import java.util.Set;

public class Missing_Reapeated {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int arrRet[] = new int[2];
        Set<Integer> st = new HashSet<>();

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (st.contains(grid[i][j])) {
                    arrRet[0] = grid[i][j];
                }
                st.add(grid[i][j]);
            }
        }

        int size = grid.length;
        size *= size;
        for (int i = 1; i <= size; i++) {
            if (!st.contains(i)) {
                arrRet[1] = i;
            }
        }

        return arrRet;
    }

}
