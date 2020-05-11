package com.javaex.practice;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner findAliquot = new Scanner(System.in);
        System.out.print("숫자를 입력하세요: ");
        int num;
        boolean again = false;
        do {
            if (again) {
                System.out.print("잘못 입력하셨습니다, 숫자를 다시 입력해주세요: ");
            }
            num = findAliquot.nextInt();
            again = true;
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    System.out.println(i);
                }
            }
        } while (num <= 0);

        findAliquot.close();
    }
}
