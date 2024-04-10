/*
Given two 0-indexed integer arrays nums1 and nums2, return a list answer of size 2 where:

answer[0] is a list of all distinct integers in nums1 which are not present in nums2.
answer[1] is a list of all distinct integers in nums2 which are not present in nums1.
Note that the integers in the lists may be returned in any order.
 */
package com.bytecode.leetcodedailyquestion.Day35;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Difference {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<Integer> list1=new ArrayList<>();
        List<List<Integer>> list2=new ArrayList<>();
        List<Integer> list3=new ArrayList<>();

        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();
        HashSet<Integer> diff1=new HashSet<>();
        HashSet<Integer> diff2=new HashSet<>();

        for (int i:nums1){
            set1.add(i);
        }
        for (int i:nums2){
            set2.add(i);
        }


        for (int i=0;i<nums2.length;i++){
            if (!set1.contains(nums2[i])) {
                diff2.add(nums2[i]);
            }
        }

        for (int i=0;i<nums1.length;i++){
            if (!set2.contains(nums1[i])){
                diff1.add(nums1[i]);
            }
        }

       for (int i:diff1){
           list1.add(i);
       }

        for (int i:diff2){
            list3.add(i);
        }

        list2.add(list1);
        list2.add(list3);

        return list2;
    }
}
