/*
You are given an m x n integer matrix grid.

We define an hourglass as a part of the matrix with the following form:

Return the maximum sum of the elements of an hourglass.

Note that an hourglass cannot be rotated and must be entirely contained within
the matrix.


 */

package com.bytecode.leetcodedailyquestion.Day36;

public class HourGlassSum {
    public int maxSum(int[][] grid) {
        int max = 0;
        int n = grid.length;
        int m = grid[0].length;
        for (int i = 0; i < n - 2; i++) {
            for (int j = 0; j < m - 2; j++) {
                int sum = 0;
                for (int z = j; z < j + 3; z++) {
                    sum += grid[i][z];
                }
                sum += grid[i + 1][j + 1];
                for (int z = j; z < j + 3; z++) {
                    sum += grid[i + 2][z];
                }
                max = Math.max(sum, max);

            }
        }
        return max;
    }
}
