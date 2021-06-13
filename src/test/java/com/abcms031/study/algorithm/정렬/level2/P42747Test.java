package com.abcms031.study.algorithm.정렬.level2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class P42747Test {
    private final P42747 solution= new P42747();


    @Test
    void solution() {
        int[] arr = {1, 11, 3, 5, 7, 9};
        int[] arr2 = {5, 5, 5, 5, 5};

        int answer = solution.solution(arr);
        int answer2 = solution.solution(arr2);
        Assertions.assertEquals(answer,4);
        Assertions.assertEquals(answer2,5);
    }
}