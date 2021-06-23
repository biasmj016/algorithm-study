package com.abcms031.study.algorithm.programmers.스택큐;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class P42586Test {
    private final P42586 solution = new P42586();

    @Test
    void solution() {
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};
        int[] progresses2 = {95, 90, 99, 99, 80, 99};
        int[] speeds2 = {1,1,1,1,1,1};

        int[] result = solution.solution(progresses,speeds);

        Assertions.assertArrayEquals(result, new int[]{2,1});

        int[] result2 = solution.solution(progresses2,speeds2);

        Assertions.assertArrayEquals(result2, new int[]{1,3,2});
    }
}