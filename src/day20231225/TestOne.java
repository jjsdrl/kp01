package day20231225;

import java.util.Scanner;

public class TestOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个数：");
        int num = scanner.nextInt();
        if (num==0)
            System.out.print(0);
        else if (num > 0)
            System.out.print("正数");
        else
            System.out.print("负数");
    }
}
