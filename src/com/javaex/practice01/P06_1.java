package com.javaex.practice01;

import java.util.Scanner;

public class P06_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 입력하세요");
        int num = scanner.nextInt();
        int sum = 0;

        if (num % 2 == 0) {
            for (int i = num; i >= 1; i = i-2) {
                sum += i;
            }
        } else {
            for (int i = num; i >= 1; i = i-2) {
                sum += i;
            }
        }
        System.out.println("결과값 : " + sum);
    }
}
