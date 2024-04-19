/*
Given an array arr, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.

After doing so, return the array.
 */
package com.bytecode.leetcodedailyquestion.day44;

import java.util.Stack;

public class ReplaceWithGreatest {
    public int[] replaceElements(int[] arr) {
        Stack<Integer> stk = new Stack<>();
        int[] nums = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {

            if (stk.size() == 0) {
                nums[i] = -1;
                stk.push(arr[i]);
            } else {
                nums[i] = stk.peek();
                if (stk.peek() < arr[i]) {
                    stk.pop();
                    stk.push(arr[i]);
                }
            }
        }
        return nums;
    }
}
