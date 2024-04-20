/*
You are given an array coordinates, coordinates[i] = [x, y], where [x, y] represents the coordinate of a point. Check if these points make a straight line in the XY plane.


 */
package com.bytecode.leetcodedailyquestion.day45;

public class StraightLine {
    public boolean checkStraightLine(int[][] coordinates) {
        if (coordinates.length < 2) {
            return true;
        }
        int x1 = coordinates[0][0];
        int y1 = coordinates[0][1];
        int x2 = coordinates[1][0];
        int y2 = coordinates[1][1];

        int dy = y2 - y1;
        int dx = x2 - x1;
        for (int i = 2; i < coordinates.length; i++) {
            int x = coordinates[i][0];
            int y = coordinates[i][1];
            System.out.println(x + "," + x1 + "," + (x - x1));
            System.out.println(y + "," + y1 + "," + (y - y1));


            if (dy * (x - x1) != dx * (y - y1)) {
                return false;
            }
        }

        return true;
    }
}
