/*
You are given an n x n integer matrix grid.

Generate an integer matrix maxLocal of size (n - 2) x (n - 2) such that:

maxLocal[i][j] is equal to the largest value of the 3 x 3 matrix in grid centered around
 row i + 1 and column j + 1.
In other words, we want to find the largest value in every contiguous 3 x 3 matrix in
grid.

Return the generated matrix.


 */
package com.bytecode.leetcodedailyquestion.Day38;

public class LocalMax {
    public int[][] largestLocal(int[][] grid) {
        int[][] result = new int[grid.length - 2][grid.length - 2];

        for (int i = 0; i < result.length; ++i) {
            for (int j = 0; j < result.length; ++j) {

                int largest = Integer.MIN_VALUE;
                for (int row = i; row < i + 3; ++row) {
                    for (int column = j; column < j + 3; ++column) {
                        largest = Math.max(largest, grid[row][column]);
                    }
                }
                result[i][j] = largest;
            }
        }
        return result;
    }
}
