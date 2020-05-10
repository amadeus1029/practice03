package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner printAddAll = new Scanner(System.in);
        System.out.println("숫자를 입력하세요");
        int num = printAddAll.nextInt();
        int result = 0;
        for(int i=num;i>0;) {
            result = result + i;
            i--;
            i--;
        }
        System.out.println("결과값: "+result);

        printAddAll.close();
    }
}
