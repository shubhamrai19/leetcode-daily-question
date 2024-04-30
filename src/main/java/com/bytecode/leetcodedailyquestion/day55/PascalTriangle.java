/*
Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above
 */
package com.bytecode.leetcodedailyquestion.day55;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public List<Integer> getRow(int numRows) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        long prev = 1;
        for (int i = 1; i <= numRows; i++) {
            long nextVal = prev * (numRows - i + 1) / i;
            list1.add((int) nextVal);
            prev = nextVal;
        }

        return list1;
    }
}
