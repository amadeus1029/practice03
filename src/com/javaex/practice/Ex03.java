package com.javaex.practice;

public class Ex03 {
    public static void main(String[] args) {
        int x,y;
        for(x=0;x<4;x++) { //x는 총 4번 반복
            for(y=2;y>0;y--) { //y는 2번 반복
                System.out.print("*");
            }
            System.out.println("");
        }
        //*가 1줄에 2개씩 4번 반복될 것
    }
}
