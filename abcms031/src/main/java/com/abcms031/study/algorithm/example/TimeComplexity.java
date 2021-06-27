package com.abcms031.study.algorithm.example;

public class TimeComplexity {

    public static int func1(int n){
        int result = 0;
        for(int i = 1; i < n; i++){
            if(i % 3 == 0 || i % 5 == 0){
                result+=i;
            }
        }
        return result;

    }
    public static int func2(int arr[], int n){
        for(int i = 0 ; i< n; i++){
            for(int j=i+1; j<n;j++){
                if(arr[i]+arr[j] == 100) return 1;
            }
        }
        return 0;
    }
    public static int func2_1(int arr[], int n){
        for(int i = 0 ; i< n; i++){
            if(arr[i]+arr[n-1] == 100){
                return 1;
            }else {
                n--;
            }
        }
        return 0;
    }
    public static int func3(int n) {
        for(int i= 1; i<n;i++){//i*i<=n 이라고 하는게 더 베스트. 시간복잡도가 그럼 루트n이 된다
            if(i*i ==n){
                return 1;
            }
        }
        return 0;
    }

    public static int func4(int n){
        int i=1;
        while(i<=n){
            if(i*2>n) {
                break;
            }
            i=i*2;
        }
        return i;
    }
}
