package com.abcms031.study.algorithm.programmers.정렬.level1;

import java.util.Arrays;

public class P42748 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            int[] splitArray = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
            Arrays.sort(splitArray);
            
            int answerIdx = commands[i][2];
            answer[i] = splitArray[answerIdx - 1];
        }
        return answer;
    }
}
