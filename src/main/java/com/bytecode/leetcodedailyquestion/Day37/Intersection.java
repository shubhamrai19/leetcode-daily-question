/*
You are given two 0-indexed integer arrays nums1 and nums2 of sizes n and m,
respectively.
Consider calculating the following values:
The number of indices i such that 0 <= i < n and nums1[i] occurs at least once in nums2.
The number of indices i such that 0 <= i < m and nums2[i] occurs at least once in nums1.
Return an integer array answer of size 2 containing the two values in the above order.
 */
package com.bytecode.leetcodedailyquestion.Day37;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Intersection {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int arr[] = new int[2];
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            list.add(nums1[i]);
        }

        for (int i = 0; i < nums2.length; i++) {
            list2.add(nums2[i]);
        }
        int count=0;
        for (int i = 0; i < nums1.length; i++) {
            if (list2.contains(nums1[i])) {
                count++;
            }
        }
        arr[0]=count;
        count=0;

        for (int i = 0; i < nums2.length; i++) {
            if (list.contains(nums2[i])) {
                count++;
            }
        }
        arr[1]=count;
        return arr;
    }
}
