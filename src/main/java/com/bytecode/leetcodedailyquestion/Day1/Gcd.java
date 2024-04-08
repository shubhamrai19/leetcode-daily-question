/*
You are given an integer array pref of size n. Find and return the array arr of size n that satisfies:

pref[i] = arr[0] ^ arr[1] ^ ... ^ arr[i].
Note that ^ denotes the bitwise-xor operation.

It can be proven that the answer is unique.

 */

package com.bytecode.leetcodedailyquestion.Day1;

public class Gcd {
    public int findGCD(int[] nums) {
        int minNum = Integer.MAX_VALUE;
        int maxNum = Integer.MIN_VALUE;
        // Find the smallest and largest numbers
        for (int num : nums) {
            minNum = Math.min(minNum, num);
            maxNum = Math.max(maxNum, num);
        }

        // Calculate the GCD
        while (minNum != maxNum) {
            if (maxNum > minNum) {
                maxNum = maxNum - minNum;
            } else {
                minNum = minNum - maxNum;
            }
        }
        return maxNum;
    }

}
