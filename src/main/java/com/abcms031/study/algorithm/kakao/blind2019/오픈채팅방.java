package com.abcms031.study.algorithm.kakao.blind2019;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class 오픈채팅방 {
    public String[] solution(String[] record) {
        Map<String, String> recordList = new HashMap<>();
        ArrayList<String> commandList = new ArrayList<>();

        for (int i = 0; i< record.length ; i++){
            String act = record[i].split(" ")[0];
            String key = "";
            String value = "";
            switch (act){
                case "Enter":
                    key = record[i].split(" ")[1];
                    value = record[i].split(" ")[2];
                    recordList.put(key, value);
                    commandList.add(key+"님이 들어왔습니다.");
                    break;

                case "Leave":
                    key = record[i].split(" ")[1];
                    commandList.add(key+"님이 나갔습니다.");
                    break;

                case "Change":
                    key = record[i].split(" ")[1];
                    value = record[i].split(" ")[2];
                    recordList.put(key, value);
                    break;
            }

        }
        String[] answer = new String[commandList.size()];

        for (int i = 0 ; i < commandList.size() ; i++){
            String id = commandList.get(i).split("님")[0];
            answer[i] = commandList.get(i).replace(id,recordList.get(id));
        }

        return answer;
    }
}
