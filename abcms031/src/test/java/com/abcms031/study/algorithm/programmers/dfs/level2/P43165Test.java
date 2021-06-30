package com.abcms031.study.algorithm.programmers.dfs.level2;

import com.abcms031.study.algorithm.programmers.dfs.level2.P43165;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class P43165Test {
    private final P43165 solution = new P43165();

    @Test
    void solution() {
        int[] numbers = {1,1,1,1,1};
        int target =3;
        int answer = solution.solution(numbers,target);

        Assertions.assertEquals(answer, 5);
    }
}