package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner calcTotalAdd = new Scanner(System.in);
        System.out.print("숫자를 입력하세요: ");
        int result = 0;
        int num;
        boolean again = false;
        do {
            if(again) {
                System.out.print("잘못 입력하셨습니다, 숫자를 다시 입력해주세요: ");
            }
            num = calcTotalAdd.nextInt();
            again = true;
        }while(num<=0);
        for(int i=1;i<=num;i++) {
            result = result + i;
        }

        System.out.println("합계: "+result);
        calcTotalAdd.close();
    }
}
