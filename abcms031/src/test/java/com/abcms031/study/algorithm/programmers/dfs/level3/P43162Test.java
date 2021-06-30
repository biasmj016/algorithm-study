package com.abcms031.study.algorithm.programmers.dfs.level3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class P43162Test {
    private final P43162 solution = new P43162();

    @Test
    void solution() {
        int[][] arr = {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};//1
        int[][] ar1 = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};//3

        int[][] ar2 = {{1, 1, 0, 0, 0, 0}, {1, 1, 0, 0, 0, 0}, {0, 0, 1, 1, 0, 1}, {0, 0, 1, 1, 0, 0}, {0, 0, 0, 0, 1, 1}, {0, 0, 1, 0, 1, 1}};

        Assertions.assertEquals(solution.solution(3, arr), 1);
        Assertions.assertEquals(solution.solution(3, ar1), 3);
        Assertions.assertEquals(solution.solution(6, ar2), 2);
    }
}