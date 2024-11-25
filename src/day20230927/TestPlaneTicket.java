package day20230927;

import java.util.Scanner;

public class TestPlaneTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入现在的月份");
        int month = scanner.nextInt();
        System.out.println("请输入你飞机票的价格");
        double money = scanner.nextDouble();
        System.out.println("请输入你想买哪个舱，经济舱or头等舱");
        String seat =scanner.next();
        if (seat.equals("经济舱")){
            if (month >= 5 && month <= 10) {
                money = money * 0.85;
                System.out.println("您购买的是" + seat + "座位" + "现在正值旺季，打折后的价格为" + money);
            } else if (month >= 11 && month <= 12) {
                money = money * 0.65;
                System.out.println("您购买的是" + seat + "座位" + "现在正值淡季，打折后的价格 为" + money);
            }else if (month >= 1 && month <= 4) {
                money = money * 0.65;
                System.out.println("您购买的是" + seat + "座位" + "现在正值淡季，打折后的价格 为" + money);
            }else {
                System.out.println("您的输入出错了");
            }
        }else if (seat.equals("头等舱")) {
            if (month >= 5 && month <= 10) {
                money = money * 0.9;
                System.out.println("您购买的是" + seat + "座位" + "现在正值旺季，打折后的价格为" + money);
            } else if (month >= 11 && month <= 12) {
                money = money * 0.7;
                System.out.println("您购买的是" + seat + "座位" + "现在正值淡季，打折后的价格 为" + money);
            }else if (month >= 1 && month <= 4) {
                money = money * 0.7;
                System.out.println("您购买的是" + seat + "座位" + "现在正值淡季，打折后的价格 为" + money);
            }else {
                System.out.println("您的输入出错了");
            }
        }else {
            System.out.println("您的输入出错了");
        }
    }
}
