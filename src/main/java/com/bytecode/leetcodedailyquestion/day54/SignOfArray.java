/*
There is a function signFunc(x) that returns:

1 if x is positive.
-1 if x is negative.
0 if x is equal to 0.
You are given an integer array nums. Let product be the product of all values in the array nums.

Return signFunc(product).
 */
package com.bytecode.leetcodedailyquestion.day54;

public class SignOfArray {
    public int arraySign(int[] nums) {
        int multiply = 1;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                multiply *= 0;
            }
            if (nums[i] < 0) {
                count++;
            }
        }
        if (count % 2 == 0) {
            multiply *= 1;
        }
        if (count % 2 != 0) {
            multiply *= -1;
        }

        return multiply;
    }
}
