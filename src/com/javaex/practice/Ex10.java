package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        //배열없이 진행해보기
        Scanner findMaxNum = new Scanner(System.in);
        System.out.println("숫자를 입력하세요");
        int max = 0;
        for(int i=0;i<5;i++) {
            System.out.print("숫자: ");
            int num = findMaxNum.nextInt();
            if(num>max) {
                max = num;
            }
        }
        System.out.println("최대값은 "+max+"입니다.");
        findMaxNum.close();
    }
}
