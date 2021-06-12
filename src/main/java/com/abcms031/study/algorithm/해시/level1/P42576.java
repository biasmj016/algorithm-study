package com.abcms031.study.algorithm.해시.level1;

import java.util.Arrays;

public class P42576 {

    public String solution_1(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);

        for(int i = 0; i < completion.length;i++){
            if(!participant[i].equals(completion[i])){
                return participant[i];
            }
        }
        return participant[participant.length-1];
    }
}
