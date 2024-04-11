/*
You are given an m x n binary matrix mat of 1's (representing soldiers) and 0's
(representing civilians). The soldiers are positioned in front of the civilians.
That is, all the 1's will appear to the left of all the 0's in each row.

A row i is weaker than a row j if one of the following is true:

The number of soldiers in row i is less than the number of soldiers in row j.
Both rows have the same number of soldiers and i < j.
Return the indices of the k weakest rows in the matrix ordered from weakest to
strongest.
 */
package com.bytecode.leetcodedailyquestion.Day36;

public class WeakestRow {
    public int[] kWeakestRows(int[][] mat, int k) {
        int arr[] = new int[mat.length];
        int res[] = new int[k];

        for (int i = 0 ; i < mat.length ; i++)
        {
            int nums [] = mat[i];
            int count = 0;
            int j = 0;
            while ( j < nums.length && nums[j] == 1 ){
                count++;
                j++;
            }
            arr[i] = count;
        }

        for (int i = 0; i < k; i++)
        {
            int index = 0 , min = arr[0];
            for (int j = 1; j < arr.length ; j++)
            {
                if (arr[j] < min ){
                    min = arr[j];
                    index = j;
                }
            }

            res[i] = index;
            arr[index] = mat[0].length+1;
        }

        return res;
    }
}
