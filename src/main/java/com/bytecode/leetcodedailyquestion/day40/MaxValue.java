/*
The value of an alphanumeric string can be defined as:

The numeric representation of the string in base 10, if it comprises of digits only.
The length of the string, otherwise.
Given an array strs of alphanumeric strings, return the maximum value of any string in strs.
 */
package com.bytecode.leetcodedailyquestion.day40;

public class MaxValue {
    public int maximumValue(String[] strs) {
        int max = 0;
        for (String s : strs) {
            boolean isNumber = true;
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c >= 'a' && c <= 'z') {
                    isNumber = false;
                    break;
                }
            }
            if (isNumber) {
                int n = Integer.parseInt(s);
                if (max < n) {
                    max = n;
                }
            } else {
                if (max < s.length()) {
                    max = s.length();
                }
            }
        }
        return max;
    }
}
