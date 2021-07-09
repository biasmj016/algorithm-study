package com.abcms031.study.algorithm.programmers.greedy.level1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class P42862Test {

    private static final P42862 solution = new P42862();

    @Test
    void solution() {
        int n = 5;
        int[] lost = {1,2,5};
        int[] reserve = {3};

        Assertions.assertEquals(4,solution.solution(n,lost,reserve));


        int n2 = 5;
        int[] lost2 = {2,4};
        int[] reserve2 = {3};

        Assertions.assertEquals(4,solution.solution(n2,lost2,reserve2));


        int n3 = 3;
        int[] lost3 = {3};
        int[] reserve3 = {1};

        Assertions.assertEquals(2,solution.solution(n3,lost3,reserve3));
    }
}