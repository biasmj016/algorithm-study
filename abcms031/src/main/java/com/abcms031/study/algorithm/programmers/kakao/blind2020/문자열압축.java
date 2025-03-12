package com.abcms031.study.algorithm.programmers.kakao.blind2020;

import java.util.ArrayList;
import java.util.List;

public class 문자열압축 {
    public static void main(String[] args) {
        String s = "xababcdcdababcdcd";
        System.out.println(compress(s));
    }

    private static int compress(String s) {
        int result = s.length();

        for (int i = 1; i <= s.length(); i++) {//i개씩 나누는 기준
            int index = 0;
            List<String> strings = new ArrayList<>();
            while (index + i <= s.length()){
                String part = s.substring(index, (index + i));
                strings.add(part);
                index += i;
            }
            if(index + i > s.length()){
                strings.add(s.substring(index));
            }
            result = Math.min(result, getCompressLength(strings));
        }
        return result;
    }

    private static int getCompressLength(List<String> strings) {
        if (strings.size() == 1) return strings.get(0).length();
        StringBuilder builder = new StringBuilder();
        String base = strings.get(0);
        int count = 1;
        for (int i = 1; i < strings.size(); i++) {
            if (base.equals(strings.get(i))) {
                count++;
            } else {
                if (count > 1) {
                    builder.append(count);
                }
                builder.append(base);
                base = strings.get(i);
                count = 1;
            }
        }
        if (count > 1) {
            builder.append(count);
        }
        builder.append(base);
        return builder.toString().length();
    }
}
