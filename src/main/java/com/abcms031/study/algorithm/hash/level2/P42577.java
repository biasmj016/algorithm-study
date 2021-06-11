package com.abcms031.study.algorithm.hash.level2;

import java.util.Arrays;

public class P42577 {
    class Solution {
        public boolean solution(String[] phone_book) {//효율성 테스트에서 시간 초과가 나오는 코드..
            Arrays.sort(phone_book);
            for(int i=0;i< phone_book.length;i++){
                String data = phone_book[i];
                int length = data.length();
                for(int j = i+1; j< phone_book.length;j++){
                    String splitData = phone_book[j];
                    if(phone_book[j].length() >= length){
                        splitData = splitData.substring(0,length);
                        if(data.equals(splitData))return false;
                    }
                }
            }
            return true;
        }
        /*
        효율성 테스트 떨어진 이유
        Arrays.sort를 하면 애초에 바로 다음 인덱스의 값만 비교하면되는데 전체를 다 돌며 비교하다보니 시간초과 에러가 떨어짐
        보다 효율적으로 코드를 짜길바람...!
        */
        public boolean solution_2(String[] phone_book) {
            Arrays.sort(phone_book);
            for(int i=0;i< phone_book.length-1;i++){
                String data = phone_book[i];
                String splitData = phone_book[i+1];
                if(splitData.length() >= data.length()) {
                    splitData = splitData.substring(0, data.length());
                    if(data.equals(splitData)) return false;
                }
            }
            return true;
        }
    }

}
