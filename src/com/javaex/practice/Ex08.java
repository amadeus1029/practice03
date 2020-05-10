package com.javaex.practice;

public class Ex08 {
    public static void main(String[] args) {
        //구구단 출력하기 ㅋㅋㅋㅋ
        for(int i=1;i<10;i++) {
            for(int j=2;j<10;j++) {
                int result = j * i;
                System.out.print(j+"*"+i+"="+result+"\t");
            }
            System.out.println("");
        }
    }
}
