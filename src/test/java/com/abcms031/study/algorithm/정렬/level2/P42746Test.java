package com.abcms031.study.algorithm.정렬.level2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.Comparator;


@SpringBootTest
class P42746Test {
    private final P42746 solution = new P42746();

    @DisplayName("P42746 테스트")
    @Test
    void testP42746(){
        int[] numbers1 = {6, 10, 2};
        int[] numbers2 = {3, 30, 34, 5, 9};
        int[] numbers3= {2,20,202,2020};
        int[] numbers4 = {0,0,0,0,0,0};

        String answer1 =solution.solution(numbers1);
        String answer2 =solution.solution(numbers2);
        String answer3 =solution.solution(numbers3);
        String answer4 =solution.solution(numbers4);

        Assertions.assertEquals("6210",answer1);
        Assertions.assertEquals("9534330",answer2);
        Assertions.assertEquals("2202202020",answer3);
        Assertions.assertEquals("0",answer4);

    }
}