/*
Given an array of strings nums containing n unique binary strings each of length n,
 return a binary string of length n that does not appear in nums.
If there are multiple answers, you may return any of them.
 */
package com.bytecode.leetcodedailyquestion.Day37;

public class UniqueBinaryString {
    public String findDifferentBinaryString(String[] nums) {
        int n = nums.length;
        char[] str = new char[n];
        for (int i = 0; i < n; i++) {
            if (nums[i].charAt(i) == '1') {
                str[i] = '0';
            } else {
                str[i] = '1';
            }
        }
        return new String(str);
    }
}

