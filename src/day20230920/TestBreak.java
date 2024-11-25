package day20230920;

import java.util.Scanner;

public class TestBreak {
    //猜数字游戏，先声明一个指定的数字，若猜对了，循环终止(中断)，否则提示对方大了/小了，然后继续猜
    public static void main(String[] args) {
        int num = 10;
        int i = 1;
        Scanner scanner = new Scanner(System.in);
        while (true){
            if(i > 3){
                System.out.println("超过3次了");
                break;
            }
            System.out.println("请开始猜数字：");
            int guessNum = scanner.nextInt();
            if (guessNum > num){
                System.out.println("猜的数字大了！！！");
            }else if (guessNum < num){
                System.out.println("猜的数字小了！！！");
            } else {
                System.out.println("恭喜你猜对了，奖励一个大嘴巴子");
                break;
            }
            i++;
        }

    }
}
