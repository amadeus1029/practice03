package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner findFive = new Scanner(System.in);
        System.out.print("숫자를 입력하세요: ");
        int num;
        int length = 0;
        int amount = 0;
        boolean again = false;
        do {
            if(again) {
                System.out.print("잘못 입력하셨습니다, 숫자를 다시 입력해주세요: ");
            }
            num = findFive.nextInt();
            again = true;
            for(int i=1;i<=num;i++) {
                if(i%5==0) {
                    length++;
                    amount += i;
                }
            }
        }while(num<=0);
        System.out.println("5의 베수의 개수: "+length);
        System.out.println("5의 배수의 합: "+amount);
        findFive.close();
    }
}
