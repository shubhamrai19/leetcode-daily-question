/*
You are given two arrays rowSum and colSum of non-negative integers where rowSum[i]
 is the sum of the elements in the ith
 row and colSum[j] is the sum of the elements of the jth column of a 2D matrix.
 In other words, you do not know the elements of the matrix, but you do know the sums
  of each row and column.

Find any matrix of non-negative integers of size rowSum.length x colSum.length that
satisfies the rowSum and colSum requirements.

Return a 2D array representing any matrix that fulfills the requirements.
It's guaranteed that at least one matrix that fulfills the requirements exists.
 */

package com.bytecode.leetcodedailyquestion.Day34;

public class ValidMatrix {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int rows = rowSum.length, cols = colSum.length;

        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int val = Math.min(rowSum[i], colSum[j]);
                rowSum[i] -= val;
                colSum[j] -= val;
                result[i][j] = val;
            }
        }
        return result;
    }
}
