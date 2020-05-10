package com.javaex.practice;

public class Ex04 {
    public static void main(String[] args) {
        for(int i=1;i<5;i++) { // 한줄에 하나씩 1~4까지 반복출력
            System.out.println(i);
        }
        System.out.println("===================="); //구분선

        for(int i=10;i>0;i=i-2) { //10부터 짝수만 5회 반복 출력
            System.out.println(i);
        }
    }
}
