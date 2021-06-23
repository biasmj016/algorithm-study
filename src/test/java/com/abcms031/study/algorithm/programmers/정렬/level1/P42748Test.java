package com.abcms031.study.algorithm.programmers.정렬.level1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class P42748Test {

    private final P42748 solution = new P42748();


    @DisplayName("42748번 문제 테스트")
    @Test
    void test42748(){
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        int [] result = solution.solution(array,commands);
        Assertions.assertNull(result);
    }
}