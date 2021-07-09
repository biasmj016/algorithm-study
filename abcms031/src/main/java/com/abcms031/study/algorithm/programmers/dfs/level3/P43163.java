package com.abcms031.study.algorithm.programmers.dfs.level3;

public class P43163 {
    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        char[] beginArray = begin.toCharArray();
        char[] targetArray = target.toCharArray();

        for(int idx = 0; idx < words.length ; idx++){
            if(!beginArray.equals(targetArray)){
                for(int i = 0; i < beginArray.length ; i++){
                    if(words[idx].charAt(i) == targetArray[i] && targetArray[i] != beginArray[i]){
                        System.out.println(words[idx]+"    "+beginArray[i]+"   "+targetArray[i]);
                        beginArray[i] = targetArray[i];
                        answer++;
                        break;
                    }
                }
            }
        }
        System.out.println(new String(beginArray));

        return new String(beginArray).equals(target) ? answer : 0;
    }

}
