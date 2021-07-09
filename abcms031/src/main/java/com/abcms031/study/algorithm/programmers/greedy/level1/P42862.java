package com.abcms031.study.algorithm.programmers.greedy.level1;

import java.util.Arrays;

public class P42862 {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;



        Arrays.sort(lost);
        Arrays.sort(reserve);

        Boolean[] wearableList = new Boolean[n];
        Arrays.fill(wearableList,true);

        for(int j = 0; j < lost.length;j++){
            int idx = lost[j]-1;
            wearableList[idx] = false;
        }

        for(int j = 0; j < reserve.length;j++){
            int reserveIdx = reserve[j]-1;

            if(wearableList[reserveIdx] == false) {
                wearableList[reserveIdx] = true;
            }else{
                if(reserveIdx == 0){
                    reserveIdx = 1;
                }else if(reserveIdx == n-1){
                    reserveIdx = n-2;
                }else{
                    reserveIdx = (wearableList[reserveIdx-1] == false) ? reserveIdx-1 : reserveIdx;
                }
                wearableList[reserveIdx] = true;
            }
        }

        for(int i = 0; i < wearableList.length;i++){
            if(wearableList[i] == true) answer++;
        }

        return answer;
    }
}
