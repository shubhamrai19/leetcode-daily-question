/*
You are given a 0-indexed integer array nums whose length is a power of 2.

Apply the following algorithm on nums:

Let n be the length of nums. If n == 1, end the process. Otherwise, create a new 0-indexed integer array newNums of length n / 2.
For every even index i where 0 <= i < n / 2, assign the value of newNums[i] as min(nums[2 * i], nums[2 * i + 1]).
For every odd index i where 0 <= i < n / 2, assign the value of newNums[i] as max(nums[2 * i], nums[2 * i + 1]).
Replace the array nums with newNums.
Repeat the entire process starting from step 1.
Return the last number that remains in nums after applying the algorithm.
 */
package com.bytecode.leetcodedailyquestion.day51;

public class MinMaxGame {
    public int minMaxGame(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return nums[0];
        }

        while (nums.length != 1) {
            int count = 0;
            int[] arr = new int[nums.length / 2];
            for (int i = 0; i < nums.length - 1; ) {
                if (count % 2 == 0) {
                    arr[count] = Math.min(nums[i], nums[i + 1]);
                    i += 2;
                } else {
                    arr[count] = Math.max(nums[i], nums[i + 1]);
                    i += 2;
                }
                count++;
            }
            count = 0;
            nums = arr;
        }
        return nums[0];
    }
}
