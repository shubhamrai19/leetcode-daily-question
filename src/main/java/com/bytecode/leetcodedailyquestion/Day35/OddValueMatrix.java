/*
There is an m x n matrix that is initialized to all 0's.
There is also a 2D array indices where each
 indices[i] = [ri, ci] represents a 0-indexed location to perform some
 increment operations on the matrix.

For each location indices[i], do both of the following:

Increment all the cells on row ri.
Increment all the cells on column ci.
Given m, n, and indices, return the number of odd-valued cells in the matrix
after applying the increment to all locations in indices.
 */
package com.bytecode.leetcodedailyquestion.Day35;

import java.util.Arrays;

public class OddValueMatrix {
    public int oddCells(int n, int m, int[][] indices) {
        int count = 0;
        int row[] = new int[n];
        int col[] = new int[m];
        for (int x[] : indices) {
            row[x[0]]++;
            col[x[1]]++;
        }
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++) {
                if ((row[i] + col[j]) % 2 != 0)
                    count++;
            }
        return count;
    }
}
