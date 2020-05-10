package com.javaex.practice;

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner bankSystem = new Scanner(System.in);
        System.out.println("---------------------------");
        System.out.println("1.입금 ∥ 2.출금 ∥ 3.잔고 ∥ 4.종료");
        System.out.println("---------------------------");
        int balance = 0;
        int amount;
        boolean keepWork = true;
        do {
            System.out.print("선택>");
            int menu = bankSystem.nextInt();
            switch (menu) {
                case 1 :
                    System.out.print("입금액>");
                    amount = bankSystem.nextInt();
                    if(amount>=0) {
                        balance = balance + amount;
                        System.out.println("입금이 완료되었습니다");
                    } else {
                        System.out.println("올바른 금액을 입력해주십시오");
                    }
                    break;
                case 2 :
                    System.out.print("출금액>");
                    amount = bankSystem.nextInt();
                    if(amount>=0){
                        if(balance>=amount) {
                            balance = balance - amount;
                            System.out.println("출금이 완료되었습니다");
                        } else  {
                            System.out.println("잔고를 초과하는 금액은 출금하실 수 없습니다");
                        }
                    } else {
                        System.out.println("올바른 금액을 입력해주십시오");
                    }
                    break;
                case 3 :
                    System.out.println("잔고액>"+balance);
                    break;
                case 4:
                    System.out.println("프로그램 종료");
                    keepWork = false;
                    break;
                default:
                    System.out.println("다시 입력해주십시오");
            }
        } while(keepWork);

        bankSystem.close();
    }
}
