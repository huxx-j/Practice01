package com.javaex.practice01;

import java.util.Scanner;

public class P07 {
    public static void main(String[] args)  {
        boolean run = true;

        Loop1 :
        while (run) {
            System.out.println("========================");
            System.out.println("  [숫자 맞추기 게임 시작]  ");
            System.out.println("========================");
            int x = (int) ((Math.random() * 100) + 1);
//            System.out.println(x);

            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.print(">>");
                int num = scanner.nextInt();

                if (num == x) {
                    System.out.println("맞았습니다.");
                    System.out.print("게임을 종료하시겠습니까? (y/n)>>");
                    Scanner scanner1 = new Scanner(System.in);
                    String sel = scanner1.nextLine();
                    if (sel.equals("y")) {
                        run = false;
                        continue Loop1;
                    } else if (sel.equals("n")) {
                        continue Loop1;
                    }
                } else if (num > x) {
                    System.out.println("더 낮게");
                } else {
                    System.out.println("더 높게");
                }
            }
        }
        System.out.println("========================");
        System.out.println("  [숫자 맞추기 게임 종료]  ");
        System.out.println("========================");
    }
}
