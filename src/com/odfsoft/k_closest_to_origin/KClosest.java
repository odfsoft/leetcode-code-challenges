package com.odfsoft.k_closest_to_origin;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KClosest {
    public int[][] solution(int[][] points, int K) {
        PriorityQueue<int[]> sortedPoints = new PriorityQueue<>(Comparator.comparingDouble(this::distance));

        for(int[] point: points) {
            sortedPoints.add(point);
        }

        int[][] result = new int[K][2];
        for(int i=0;i<K;i++) {
            result[i] = sortedPoints.poll();
        }

        return result;
    }

    private double distance(int[] point) {
        return Math.sqrt( Math.pow(0 - point[0], 2) + Math.pow(0 - point[1], 2));
    }
}
