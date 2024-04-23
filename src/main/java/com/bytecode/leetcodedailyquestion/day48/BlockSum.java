/*
Given a m x n matrix mat and an integer k, return a matrix answer where each answer[i][j] is the sum of all elements mat[r][c] for:

i - k <= r <= i + k,
j - k <= c <= j + k, and
(r, c) is a valid position in the matrix.
 */
package com.bytecode.leetcodedailyquestion.day48;

public class BlockSum {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int[][] res = new int[mat.length][mat[0].length];

        for (int i = 0; i < mat.length; i++)
            for (int j = 0; j < mat[0].length; j++)
                res[i][j]=sumMat(k,mat,i,j);

        return res;
    }

    int sumMat(int k, int[][] mat, int i, int j) {
        int sum = 0;

        for (int a = i - k; a <= i + k; a++){
            if (a >= 0 && mat.length > a){
                for (int b = j - k; b <= j + k; b++){
                    if (b >= 0 && mat[0].length > b){
                        sum+=mat[a][b];
                    }
                }
            }

        }

        return sum;
    }
}
