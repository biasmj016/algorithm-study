package com.abcms031.study.algorithm.정렬.level2;

import java.util.Arrays;
import java.util.Collections;

public class P42747 {
    public int solution(int[] citations) {
        int answer = 0;

        Integer[] array= Arrays.stream(citations).boxed().toArray(Integer[]::new);
        Arrays.sort(array, Collections.reverseOrder());

        for (int i = 0; i <= array.length-1; i++) {
            if (i+1 <= array[i]) {
                answer = i+1;
            }
        }
        return answer;
    }
}
/*        문제 이해에서 너무 오래 걸림, 인용횟수는 배열의 값과 별개로 증가해야한다
        예를 들어,[11, 9, 7, 5, 3, 1] 경우, 4번째의 5-11까지가 4번 이상 인용되었고, 5번째의 3은 5번 이상 인용되지못했기에 답은 4로 나와야한다.*/