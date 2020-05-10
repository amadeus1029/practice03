package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner findNum = new Scanner(System.in);
        System.out.println("=======================");
        System.out.println("   [숫자맞추기 게임 시작]  ");
        System.out.println("=======================");
        int answer = (int)(Math.random()*100)+1;
        System.out.println("정답:"+answer);
        boolean endGame = true;

        do {
            System.out.print(">>");
            int submitNum = findNum.nextInt();
            if(submitNum>0&&submitNum<101) {
                if(submitNum<answer) {
                    System.out.println("더 높게");
                } else if(submitNum>answer) {
                    System.out.println("더 낮게");
                } else {
                    System.out.println("맞았습니다.");
                    boolean doAnswer = true;
                    do {
                        System.out.print("계임을 종료하시겠습니까?(y/n) >>");
                        char keepPlay = findNum.next().charAt(0);
                        switch (keepPlay) {
                            case 'y' :
                                doAnswer = false;
                                System.out.println("=======================");
                                System.out.println("   [숫자맞추기 게임 종료]  ");
                                System.out.println("=======================");
                                endGame = false;
                                findNum.close();
                                break;
                            case 'n' :
                                doAnswer = false;
                                answer = (int)(Math.random()*100)+1;
                                System.out.println("정답:"+answer);
                                break;
                            default :
                                System.out.println("잘못 입력하셨습니다, y 혹은 n을 입력해주세요");
                        }
                    } while(doAnswer);
                }
            } else {
                System.out.println("숫자게임의 정답은 1과 100 사이의 숫자입니다, 다시 입력해주세요.");
                continue;
            }
        } while (endGame);
    }
}
