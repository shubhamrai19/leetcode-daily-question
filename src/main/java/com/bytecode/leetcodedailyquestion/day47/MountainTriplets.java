/*
You are given a 0-indexed array nums of integers.

A triplet of indices (i, j, k) is a mountain if:

i < j < k
nums[i] < nums[j] and nums[k] < nums[j]
Return the minimum possible sum of a mountain triplet of nums. If no such triplet exists, return -1.
 */
package com.bytecode.leetcodedailyquestion.day47;

public class MountainTriplets {
    public int minimumSum(int[] arr) {
        int min = Integer.MAX_VALUE;
        int flag = 0;
        int n = arr.length;
        int i = 0, j = 1, k = 2;
        while (true) {
            if (arr[i] < arr[j] && arr[j] > arr[k]) {
                flag = 1;
                int x = arr[i] + arr[j] + arr[k];
                if (x < min) {
                    min = x;
                }
            }
            if (k < n - 1) {
                k++;
            } else if (j < k - 1) {
                j++;
                k = j + 1;
            } else if (i < j - 1) {
                i++;
                j = i + 1;
                k = i + 2;
            } else {
                break;
            }
        }
        if (flag == 0) {
            return -1;
        }

        return min;
    }
}
