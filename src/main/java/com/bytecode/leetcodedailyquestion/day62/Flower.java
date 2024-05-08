/*
You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.

Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.
 */
package com.bytecode.leetcodedailyquestion.day62;

public class Flower {
    public boolean canPlaceFlowers(int[] arr, int n) {
        if (arr.length == 1 && arr[0] == 0 && n == 1) {
            return true;
        }
        if (n == 0) {
            return true;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (i == 0 && arr[i] == 0 && arr[i + 1] == 0) {
                arr[0] = 1;
                n--;
                if (n == 0) {
                    return true;
                }
            }
            if (i > 0) {
                if (arr[i] == 0 && arr[i - 1] != 1 && arr[i + 1] == 0) {
                    arr[i] = 1;
                    n--;
                    if (n == 0) {
                        return true;
                    }
                }
            }
            if (arr[arr.length - 1] == 0 && arr[arr.length - 2] == 0) {
                arr[arr.length - 1] = 1;
                n--;
                if (n == 0) {
                    return true;
                }
            }
        }

        return false;
    }
}
