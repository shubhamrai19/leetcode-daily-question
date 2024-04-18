/*
A bus has n stops numbered from 0 to n - 1 that form a circle. We know the distance between all pairs of neighboring stops where distance[i] is the distance between the stops number i and (i + 1) % n.

The bus goes along both directions i.e. clockwise and counterclockwise.

Return the shortest distance between the given start and destination stops.
 */
package com.bytecode.leetcodedailyquestion.day43;

public class BusStopDistance {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int min = 0;
        int min2 = 0;
        int n = distance.length;
        for (int i = start; i != destination; i = (i + 1) % n) {
            min += distance[i];
        }
        for (int i = destination; i != start; i = (i + 1) % n) {
            min2 += distance[i];
        }


        return Math.min(min2, min);
    }
}
