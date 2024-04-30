/*
You are given an array of unique integers salary where salary[i] is the salary of the ith employee.

Return the average salary of employees excluding the minimum and maximum salary. Answers within 10-5 of the actual answer will be accepted.
 */
package com.bytecode.leetcodedailyquestion.day55;

import java.util.Arrays;

public class AvgSalary {
    public double average(int[] salary) {
        Arrays.sort(salary);
        double sum=0;
        for(int i=1;i<salary.length-1;i++){
            sum+=salary[i];
        }
        double avgSalary=sum/(salary.length-2);
        return avgSalary;
    }
}
