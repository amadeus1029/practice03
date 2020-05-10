package com.javaex.practice;

public class Ex05 {
    public static void main(String[] args) {
        int i=1;
        boolean flag = true;

        while(flag) {
            if(i>=5) { //i가 5가 되면 조건이 성립되지 않으므로 1~5까지만 반복 ( 5까지는 출력 )
                flag = false;
            }
            System.out.println(i); //한줄에 하나씩 1~5까지 출력
            i=i+1;
        }
    }
}
