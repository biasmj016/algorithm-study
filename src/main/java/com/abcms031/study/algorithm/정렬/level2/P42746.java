package com.abcms031.study.algorithm.정렬.level2;

import java.util.Arrays;
import java.util.Comparator;

public class P42746 {
    public String solution(int[] numbers) {
        String answer ="";
        String[] convertNumbers = new String[numbers.length];

        for(int i = 0; i<numbers.length;i++){
            convertNumbers[i]=String.valueOf(numbers[i]);
        }

        Arrays.sort(convertNumbers, new Comparator<String>() {
            @Override
            public int compare(String num1, String num2) {
                return (num2+num1).compareTo(num1+num2);
            }
        });

        for(int j =0;j<convertNumbers.length;j++){
            answer+=convertNumbers[j];
        }

        return answer.startsWith("0") ? "0" : answer;

    }
}
/*처음에는 sort로 정렬한 값으로 문제푸는 방향을 잡았는데 30 과 3 일 경우 30을 리턴하는 것에서 답의 오류가 발생,
        처음에 헤매다 보니 시간이 생각보다 오래걸렸음..*/