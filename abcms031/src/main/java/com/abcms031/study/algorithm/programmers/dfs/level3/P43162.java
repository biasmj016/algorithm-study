package com.abcms031.study.algorithm.programmers.dfs.level3;

public class P43162 {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        int[] result= new int[n];
        for (int i = 0; i< n;i++){
            if(result[i] == 0){
                dfs(computers,i,result);
                answer++;
            }
        }
        return answer;
    }
    int[] dfs(int[][] computers, int i, int[] result) {
        result[i] = 1;
        for (int j = 0; j < computers.length; j++) {
            if ((i) != j && computers[i][j] == 1 && result[j] == 0) {
                result = dfs(computers, j, result);
            }
        }
        return result;
    }
}
