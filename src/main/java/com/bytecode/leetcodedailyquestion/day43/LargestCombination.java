/*
The bitwise AND of an array nums is the bitwise AND of all integers in nums.

For example, for nums = [1, 5, 3], the bitwise AND is equal to 1 & 5 & 3 = 1.
Also, for nums = [7], the bitwise AND is 7.
You are given an array of positive integers candidates. Evaluate the bitwise AND of every combination of numbers of candidates. Each number in candidates may only be used once in each combination.

Return the size of the largest combination of candidates with a bitwise AND greater than 0.
 */
package com.bytecode.leetcodedailyquestion.day43;

public class LargestCombination {
    public int largestCombination(int[] candidates) {
        int[] ones = new int[24];
        for (int candidate : candidates){
            int index = 0;
            while (candidate != 0){
                if((candidate & 1) == 1){
                    ones[index] += 1;
                }
                candidate = candidate >> 1;
                index++;
            }
        }
        int maxAns = 0;
        for (int i = 0; i < ones.length; i++) {
            maxAns = Math.max(maxAns, ones[i]);
        }
        return maxAns;
    }
}
