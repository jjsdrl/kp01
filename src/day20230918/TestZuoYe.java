package day20230918;

import java.util.Scanner;


public class TestZuoYe {

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入一个数字");
//        int num = scanner.nextInt();
//        if (num == 0){
//            System.out.println(num+"为0");
//        }else if (num > 0 ){
//            System.out.println(num+"为正数");
//        }else {
//            System.out.println(num+"为负数");
//        }
//    }

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入一个数字");
//        int num = scanner.nextInt();
//        if (num == 1){
//            System.out.println("贝贝");
//        } else if (num == 2){
//            System.out.println("晶晶");
//        }else if (num == 3){
//            System.out.println("欢欢");
//        }else if (num == 4){
//            System.out.println("迎迎");
//        }else if (num == 5){
//            System.out.println("妮妮");
//        }else {
//            System.out.println("北京欢迎您");
//        }
//    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("您要查询周几的食谱");
        int week = scanner.nextInt();
        switch (week){
            case 1:
                System.out.println("周一的食谱:麻辣烫");
                break;
            case 2:
                System.out.println("周二的食谱:拌面");
                break;
            case 3:
                System.out.println("周三的食谱:炸酱面");
                break;
            case 4:
                System.out.println("周四的食谱:热干面");
                break;
            case 5:
                System.out.println("周五的食谱:火锅");
                break;
            case 6:
                System.out.println("周六的食谱:麻辣香锅");
                break;
            case 7:
                System.out.println("周一的食谱:方便面");
                break;
            default:
                System.out.println("瞪大你的眼睛，看看有周"+week+"吗？");
        }
    }
}
