package com.javaex.practice01;

import java.util.Scanner;

public class P06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 입력하세요");
        int num = scanner.nextInt();
        int evenSum = 0;
        int oddSum = 0;

        if (num % 2 == 0) {
            for (int i = num; i >= 1; i--) {
                //
                if (i % 2 == 0) {
                    evenSum += i;
                }
            }
            System.out.println("결과값 : " + evenSum);
        } else{
            for (int i = num; i >= 1; i--) {
                if (i % 2 == 1) {
                    oddSum += i;
                }
            }
            System.out.println("결과값 : " + oddSum);
        }
    }
}

//