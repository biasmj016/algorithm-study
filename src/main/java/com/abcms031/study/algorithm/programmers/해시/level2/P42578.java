package com.abcms031.study.algorithm.programmers.해시.level2;

import java.util.*;

public class P42578 {
    public int solution(String[][] clothes) {//문제는 금방 파악했는데 경우의 수 공식에서 헤맴
        int answer =1;
        Map<String, Integer>  list = new HashMap<>();

        for(int i = 0 ; i< clothes.length;i++){
            int num = 0;
            if(list.containsKey(clothes[i][1])){
                num = list.get(clothes[i][1]);
            }
            list.put(clothes[i][1], num+1);
        }

        Set<String> keys = list.keySet();
        for(String key:keys){
            answer*=list.get(key)+1;
        }
        return answer-1;//아무것도 입지 않은 경우 제외
    }
}
