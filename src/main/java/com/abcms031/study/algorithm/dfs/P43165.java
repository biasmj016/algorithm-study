package com.abcms031.study.algorithm.dfs;


public class P43165 {
    public int solution(int[] numbers, int target) {
        int answer = 0;

        answer += targetNumber(numbers, numbers[0], target, 1) +
                targetNumber(numbers, -numbers[0], target, 1);
        return answer;
    }

    public static int targetNumber(int[] numbers, int sum, int target, int idx) {
        int result = 0;

        if (idx == numbers.length) {
            if (sum == target) {
                return 1;
            } else {
                return 0;
            }
        }

        result += targetNumber(numbers, sum + numbers[idx], target, idx + 1) +
                targetNumber(numbers, sum - numbers[idx], target, idx + 1);

        return result;
    }
}
