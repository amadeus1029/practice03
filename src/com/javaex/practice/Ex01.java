package com.javaex.practice;

public class Ex01 {
    public static void main(String[] args) {
        System.out.println("while문");
        int index = 0;
        while(index<3) {
            System.out.println("index="+index);
            index++;
        }

        System.out.println("for문");
        for(int order=0; order<3; order++) {
            System.out.println("order="+order);
        }
        //while가 order 모두 종료시점이 같으므로 같은 값이 출력될 것이다
    }
}
