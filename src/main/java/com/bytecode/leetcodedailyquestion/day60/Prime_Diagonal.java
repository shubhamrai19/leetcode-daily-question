/*
You are given a 0-indexed two-dimensional integer array nums.

Return the largest prime number that lies on at least one of the diagonals of nums. In case, no prime is present on any of the diagonals, return 0.

Note that:

An integer is prime if it is greater than 1 and has no positive integer divisors other than 1 and itself.
An integer val is on one of the diagonals of nums if there exists an integer i for which nums[i][i] = val or an i for which nums[i][nums.length - i - 1] = val.
 */
package com.bytecode.leetcodedailyquestion.day60;

public class Prime_Diagonal {
    public int diagonalPrime(int[][] nums) {
        int maxi = 0;
        for (int i = 0; i < nums.length; i++) {
            if (prime(nums[i][i])) {
                maxi = Math.max(maxi, nums[i][i]);
            }
            if (prime(nums[nums.length - i - 1][i])) {
                maxi = Math.max(maxi, nums[nums.length - i - 1][i]);
            }
        }
        return maxi;
    }

    public boolean prime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }
}
