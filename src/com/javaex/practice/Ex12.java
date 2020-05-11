package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner calcFactorial = new Scanner(System.in);
        System.out.println("숫자를 입력하세요");
        int result = 1;
        int num;
        boolean again = false;
        do {
            if(again) {
                System.out.println("잘못 입력하셨습니다, 숫자를 다시 입력해주세요");
            }
            num = calcFactorial.nextInt();
            again = true;
            for(int i=1;i<=num;i++) {
                result = result * i;
            }
        }while(num<=0);

        System.out.println("결과값: "+result);
        calcFactorial.close();

    }
}
