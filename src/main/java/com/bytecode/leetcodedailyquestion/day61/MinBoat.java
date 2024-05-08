/*
You are given an array people where people[i] is the weight of the ith person,
 and an infinite number of boats where each boat can carry a maximum weight of limit.
 Each boat carries at most two people at the same time, provided the sum of the weight
  of those people is at most limit.

Return the minimum number of boats to carry every given person.
 */
package com.bytecode.leetcodedailyquestion.day61;

import java.util.Arrays;

public class MinBoat {
    public int numRescueBoats(int[] people, int limit) {
        int count=0;
        Arrays.sort(people);
        int left=0;
        int right= people.length-1;
        int pos=0;
        int winSum=0;
        while (left<=right){
            if (people[left]+people[right]<=limit){
                left++;
                right--;
            }else {
                right--;
            }
            count++;
        }
        return count;
    }
}
