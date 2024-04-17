/*
You are given an array apple of size n and an array capacity of size m.

There are n packs where the ith pack contains apple[i] apples. There are m boxes as well, and the ith box has a capacity of capacity[i] apples.

Return the minimum number of boxes you need to select to redistribute these n packs of apples into boxes.

Note that, apples from the same pack can be distributed into different boxes.
 */
package com.bytecode.leetcodedailyquestion.day42;

import java.util.Arrays;

public class AppleRedistribution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int sumApple = 0;
        for (int i : apple) {
            sumApple += i;
        }
        Arrays.sort(capacity);
        int sumCap = 0;
        int i = capacity.length - 1;
        int count = 0;

        while (sumCap < sumApple) {
            sumCap += capacity[i];
            i--;
            count++;
        }
        return count;
    }
}
