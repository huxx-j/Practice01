package com.javaex.practice01;

import java.util.Scanner;

public class P08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int balance = 0;
        int money;

        while (run) {
            System.out.println("-------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("-------------------------------");
            System.out.print("선택 >");
            int num = scanner.nextInt();
            switch (num) {
                case 1 :
                    System.out.print("예금액 >");
                    money = scanner.nextInt();
                    balance += money;
                    continue;

                case 2 :
                    System.out.print("출금액 >");
                    money = scanner.nextInt();
                    balance -= money;
                    continue;

                case 3 :
                    System.out.println("잔고액 >" + balance);
                    continue;

                case 4 :
                    System.out.println("프로그램 종료");
                    run = false;
                    break;
            }
        }
    }
}
