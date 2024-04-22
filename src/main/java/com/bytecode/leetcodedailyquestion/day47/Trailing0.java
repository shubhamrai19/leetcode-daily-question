/*
Given an integer n, return the number of trailing zeroes in n!.

Note that n! = n * (n - 1) * (n - 2) * ... * 3 * 2 * 1.
 */
package com.bytecode.leetcodedailyquestion.day47;

public class Trailing0 {
    public int trailingZeroes(int n) {
        int count = 0;

        while (n >= 5) {
            count += n / 5;
            n = n / 5;
        }

        return count;
    }
}
