package com.javaex.practice01;

import java.util.Scanner;

public class P05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 입력하세요");
        int max = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("숫자 > ");
            int num = scanner.nextInt();
            if (max < num) {
                max = num;
            }
        }
        System.out.println("최대값은 " + max + "입니다.");
    }
}
