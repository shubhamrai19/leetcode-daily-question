/*
You have a bomb to defuse, and your time is running out! Your informer will provide you with a circular array code of length of n and a key k.

To decrypt the code, you must replace every number. All the numbers are replaced simultaneously.

If k > 0, replace the ith number with the sum of the next k numbers.
If k < 0, replace the ith number with the sum of the previous k numbers.
If k == 0, replace the ith number with 0.
As code is circular, the next element of code[n-1] is code[0], and the previous element of code[0] is code[n-1].

Given the circular array code and an integer key k, return the decrypted code to defuse the bomb!
 */
package com.bytecode.leetcodedailyquestion.day45;

public class DefuseBomb {
    public int[] decrypt(int[] code, int k) {
        int[] arr = new int[code.length];
        int n = code.length;
        for (int i = 0; i < code.length; i++) {
            if (k == 0) {
                arr[i] = 0;
            }
            if (k > 0) {
                int x = i + 1;
                for (int j = 1; j <= k; j++) {
                    if (x > n - 1) {
                        x = 0;
                    }
                    arr[i] += code[x];
                    x++;
                }
            } else if (k < 0) {
                int x = i-1;
                for (int j = 0; j > k; j--) {
                    if (x < 0) {
                        x = n - 1;
                    }
                    arr[i]+=code[x];
                    x--;
                }
            }
        }
        return arr;
    }
}
