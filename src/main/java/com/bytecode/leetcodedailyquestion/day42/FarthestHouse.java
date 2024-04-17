/*
There are n houses evenly lined up on the street, and each house is beautifully painted.
 You are given a 0-indexed integer array colors of length n, where colors[i] represents the color of the ith house.

Return the maximum distance between two houses with different colors.

The distance between the ith and jth houses is abs(i - j), where abs(x) is
the absolute value of x.
 */
package com.bytecode.leetcodedailyquestion.day42;

public class FarthestHouse {
    public int maxDistance(int[] colors) {
        int n = colors.length - 1;
        int ans1 = 0;
        int ans2 = 0;
        int max1 = 0;
        int max2 = 0;
        for (int i = 0; i < n; i++) {
            if (colors[i] != colors[n]) {
                ans1 = Math.abs(n - i);
                max1 = Math.max(ans1, max1);
            }
        }
        for (int i = n; i >= 0; i--) {
            if (colors[i] != colors[0]) {
                ans2 = Math.abs(0 - i);
                max2 = Math.max(ans2, max2);
            }
        }
        return (int) Math.max(max1, max2);
    }
}
