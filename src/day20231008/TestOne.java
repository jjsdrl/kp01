package day20231008;

import java.util.Scanner;

public class TestOne {
    public static void main(String[] args) {
//        1、编写一个Java程序，计算并打印出给定正整数的所有因子。
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个正整数:");
        int num = scanner.nextInt();
        System.out.println(num+"的因子有：");
        for (int i = 1; i < num; i++) {
            if (num % i == 0 ){
                System.out.print(" "+i);
            }
        }

    }
}
