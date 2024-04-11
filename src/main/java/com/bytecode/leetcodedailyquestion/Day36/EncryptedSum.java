/*
You are given an integer array nums containing positive integers.
We define a function encrypt such that encrypt(x) replaces every digit in x
with the largest digit in x. For example, encrypt(523) = 555 and encrypt(213) = 333.

Return the sum of encrypted elements.
 */
package com.bytecode.leetcodedailyquestion.Day36;

public class EncryptedSum {
    public int sumOfEncryptedInt(int[] nums) {
        int sum = 0;
        for (int i : nums) {
            if (i > 9) {
                int max = 0;
                int count = 0;
                while (i != 0) {
                    int r = i % 10;
                    count++;
                    if (r > max) {
                        max = r;
                    }
                    i = i / 10;
                }

                while (count > 1) {
                    sum += (int) Math.pow(10, count - 1) * max;
                    count--;
                }
                sum += max;
            } else {
                sum += i;
            }
        }
        return sum;
    }
}
