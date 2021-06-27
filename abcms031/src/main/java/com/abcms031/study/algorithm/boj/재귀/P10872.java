package com.abcms031.study.algorithm.boj.재귀;

public class P10872 {
    public int solution(int x) {
        return pivonachi(x);
    }
    private int pivonachi(int x){
        if(x == 0 || x == 1) return x;
        return pivonachi(x-2) + pivonachi(x-1);
    }

}
