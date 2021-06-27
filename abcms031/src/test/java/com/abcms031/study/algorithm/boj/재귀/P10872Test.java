package com.abcms031.study.algorithm.boj.재귀;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class P10872Test {

    private final P10872 solution= new P10872();

    @Test
    void solution() {

        int result =solution.solution(10);
        Assertions.assertEquals(result,55);
    }
}
