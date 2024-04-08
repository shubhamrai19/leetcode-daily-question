/*
Given an integer array nums, return all the triplets [nums[i], nums[j],
nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.
 */
package com.bytecode.leetcodedailyquestion.Day3;

import java.util.*;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> setList=new HashSet<>();
        Arrays.sort(nums);
        for (int i=0;i< nums.length-2;i++){
            int j=i+1;
            int k= nums.length-1;
            while (j<k){
                int sum=nums[j]+nums[k];
                if (sum==-nums[i]){
                    setList.add(Arrays.asList(nums[i],nums[j++],nums[k--]));
                }else if (sum>-nums[i])k--;
                else if (sum<-nums[i])j++;
            }
        }

        return new ArrayList<>(setList);
    }
}
