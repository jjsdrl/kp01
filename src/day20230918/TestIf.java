package day20230918;

import java.util.Scanner;

public class TestIf {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        //scanner.next()阻塞程序，直到用户在控制台上输入完数据
//        System.out.println("请输入今天的天气:例如，下雨/没下雨");
//        String info = scanner.next();
//        if ("下雨".equals(info)){
//            System.out.println("带伞！！！！");
//            }



//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入您的考试成绩：例如，及格/不及格");
//        String info = scanner.next();
//        if ("及格".equals(info)){
//            System.out.println("请室友吃饭！！！");
//        }else{
//            System.out.println("室友请你吃饭");
//        }


        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的考试成绩：例如，60");
        int score = scanner.nextInt();
        if (score > 100 || score < 0 ){
            System.out.println("请输入正常的分数：[0-100]");
            return;//中断函数
        }
        if(score <= 100 && score >= 90){
            System.out.println("奖励你一台华为mate60！！！");
        } else if (score < 90 && score >= 80) {
            System.out.println("奖励你一台I Watch！！！");
        } else if (score < 80 && score >= 70){
            System.out.println("奖励你Beat耳机！！！");
        } else if (score < 70 && score >= 60) {
            System.out.println("奖励一顿隆江猪脚饭！！！");
        } else {
            System.out.println("奖励黄雨萱一个大嘴巴子！！！");
        }

    }
}
