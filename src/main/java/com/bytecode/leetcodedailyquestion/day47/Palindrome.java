/*
Given an integer x, return true if x is a
palindrome
, and false otherwise.
 */
package com.bytecode.leetcodedailyquestion.day47;

public class Palindrome {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int y = x;
        int reverse = 0;

        while (y != 0) {
            int r = y % 10;
            reverse = reverse * 10 + r;
            y = y / 10;
        }
        return x == reverse;
    }
}
