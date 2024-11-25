package day20230918;

import java.util.Scanner;

public class TestMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入当前的月份");
        int answer = scanner.nextInt();
        if (answer == 3 || answer == 4|| answer== 5) {
            System.out.println("当前为春季");
        } else if (answer == 6 || answer == 7|| answer== 8) {
            System.out.println("当前为夏季");
        }else if (answer == 9 || answer == 10|| answer== 11) {
            System.out.println("当前为秋季");
        }else if (answer == 12 || answer == 1|| answer== 2) {
            System.out.println("当前为冬季");
        }else {
            System.out.println("请输入正常的月份：[1-12]");
        }
    }
}
