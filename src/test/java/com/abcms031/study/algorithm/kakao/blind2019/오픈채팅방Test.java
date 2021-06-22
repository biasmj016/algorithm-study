package com.abcms031.study.algorithm.kakao.blind2019;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class 오픈채팅방Test {

    private final 오픈채팅방 solution = new 오픈채팅방();

    @Test
    void solution() {
        String[] answer = {};
        String[] record = {"Enter uid1234 Muzi",
                "Enter uid4567 Prodo","Leave uid1234",
                "Enter uid1234 Prodo","Change uid4567 Ryan"};

        answer = solution.solution(record);

        Assertions.assertArrayEquals(answer,
                new String[]{"Prodo님이 들어왔습니다.",
                            "Ryan님이 들어왔습니다.",
                            "Prodo님이 나갔습니다.",
                            "Prodo님이 들어왔습니다."});
    }
}