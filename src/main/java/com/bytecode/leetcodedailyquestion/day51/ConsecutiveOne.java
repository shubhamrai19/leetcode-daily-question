/*
Given an integer array arr, return true if there are three consecutive odd numbers in the array. Otherwise, return false.
 */
package com.bytecode.leetcodedailyquestion.day51;

public class ConsecutiveOne {
    public boolean threeConsecutiveOdds(int[] arr) {
        int count=0;

        for (int i:arr){
            if (i%2!=0){
                count++;
            }else {
                count=0;
            }
            if (count>2){
                return true;
            }
        }
        return false;
    }
}
