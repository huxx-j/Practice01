package com.javaex.practice01;

public class P03 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int k = 2; k <= 9; k++) {
                System.out.print(k + "*" + i + "=" + k * i + "\t");
            }
            System.out.println();
        }
    }
}
