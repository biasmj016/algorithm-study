package com.abcms031.study.algorithm.programmers.dfs.level3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class P43163Test {
    private final P43163 solution = new P43163();
    @Test
    void solution() {

        String begin = "hit";
        String target = "cog";
        String[] arr = {"hot", "dot", "dog", "lot", "log", "cog"};

        Assertions.assertEquals(4, solution.solution(begin,target,arr));

    }
}