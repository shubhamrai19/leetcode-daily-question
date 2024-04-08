/*
You have n boxes. You are given a binary string boxes of length n,
where boxes[i] is '0' if the ith box is empty, and '1' if it contains one ball.

In one operation, you can move one ball from a box to an adjacent box.
Box i is adjacent to box j if abs(i - j) == 1. Note that after doing so,
there may be more than one ball in some boxes.

Return an array answer of size n, where answer[i] is the minimum number of
operations needed to move all the balls to the ith box.

Each answer[i] is calculated considering the initial state of the boxes.
 */

package com.bytecode.leetcodedailyquestion.Day2;

public class MinOperation_MoveAll {
    public int[] minOperations(String boxes) {
        char s[]=boxes.toCharArray();
        int r[]=new int[s.length];
        int c=0,ops=0;
        for(int i=0;i<s.length;i++){
            r[i]+=ops;
            c+=s[i]=='1'?1:0;
            ops+=c;
        }
        c=0; ops=0;
        for(int i=s.length-1;i>=0;i--){
            r[i]+=ops;
            c+=s[i]=='1'?1:0;
            ops+=c;
        }
        return r;
    }
}
