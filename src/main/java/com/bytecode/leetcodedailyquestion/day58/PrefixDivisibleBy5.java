/*
You are given a binary array nums (0-indexed).

We define xi as the number whose binary representation is the subarray nums[0..i] (from most-significant-bit to least-significant-bit).

For example, if nums = [1,0,1], then x0 = 1, x1 = 2, and x2 = 5.
Return an array of booleans answer where answer[i] is true if xi is divisible by 5.
 */
package com.bytecode.leetcodedailyquestion.day58;

import java.util.ArrayList;
import java.util.List;

public class PrefixDivisibleBy5 {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        ArrayList<Boolean> list = new ArrayList<>();
        int temp = 0;
        for (int j = 0; j < nums.length; j++) {
            temp = (temp * 2 + nums[j]) % 10;
            if (temp % 5 == 0) {
                list.add(true);
            } else {
                list.add(false);
            }
        }
        return list;
    }
}
