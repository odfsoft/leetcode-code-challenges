package com.odfsoft.k_closest_to_origin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class KClosestTest {

    @Test
    void solution() {

        int[][] result = new KClosest().solution(new int[][] {{1,3},{-2,2}}, 1);

        assertArrayEquals(new int[][] {{-2, 2}}, result);
    }
}