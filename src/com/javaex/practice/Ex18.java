package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner paintStar = new Scanner(System.in);
        System.out.print("숫자를 입력하세요: ");
        int num;
        boolean again = false;
        do {
            if(again) {
                System.out.print("잘못 입력하셨습니다, 숫자를 다시 입력해주세요: ");
            }
            num = paintStar.nextInt();
            again = true;
            for(int i=num;i>0;i--) {
                for(int j=0;j<i;j++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
            for(int i=2;i<=num;i++) {
                for(int j=0;j<i;j++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
        }while(num<=0);
        paintStar.close();
    }
}
