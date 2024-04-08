/*
You are given an integer array pref of size n. Find and return the array arr of
 size n that satisfies:
pref[i] = arr[0] ^ arr[1] ^ ... ^ arr[i].
Note that ^ denotes the bitwise-xor operation.
It can be proven that the answer is unique.
 */

package com.bytecode.leetcodedailyquestion.Day1;

public class PrefixXor {
    public int[] findArray(int[] pref) {
        int[] arr = new int[pref.length];
        for (int i = 1; i < pref.length; i++) {
            arr[i] = pref[i] ^ pref[i - 1];

        }
        arr[0] = pref[0];
        return arr;
    }
}
