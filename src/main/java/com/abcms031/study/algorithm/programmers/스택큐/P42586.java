package com.abcms031.study.algorithm.programmers.스택큐;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class P42586 {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};

        List<Integer> answerList = new ArrayList<>();
        Stack<Integer> progress = new Stack<>();
        Stack<Integer> speed = new Stack<>();

        for (int i = progresses.length - 1; i >= 0; i--) {
            progress.add(progresses[i]);
            speed.add(speeds[i]);
        }
        int pointer =progress.size()-1;

        while (pointer >= 0) {
            int cnt = 0;
            Integer num = progress.get(pointer);
            if (num >= 100) {
                for (int j = pointer; j >= 0; j--) {
                    if (progress.get(j) >= 100) {
                        progress.pop();
                        speed.pop();
                        pointer--;
                        cnt++;
                    }else{
                        break;
                    }
                }
                answerList.add(cnt);
            } else {
                for (int j = pointer; j >= 0; j--) {
                    int num2= progress.get(j) + speed.get(j);
                    progress.set(j,num2);
                }
            }
        }
        answer = new int[answerList.size()];
        for(int i = 0 ; i< answerList.size() ; i++){
            answer[i] = answerList.get(i).intValue();
        }

        return answer;
    }
}
