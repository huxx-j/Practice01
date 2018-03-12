package com.javaex.practice01;

public class P04 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int k = i; k < i+10; k++) {
                System.out.print(k + "\t" + "\t");
            }
            System.out.println();
        }
    }
}
