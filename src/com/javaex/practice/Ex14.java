package com.javaex.practice;

import java.awt.*;
import java.util.Scanner;

public class Ex14 {
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
            for(int i=1;i<=num;i++) {
                System.out.print(i);
                if(i<num) {
                    System.out.print("+");
                }
                result = result + i;
            }
        }while(num<=0);
        System.out.println("");
        System.out.println("합계: "+result);

        calcTotalAdd.close();
    }
}
