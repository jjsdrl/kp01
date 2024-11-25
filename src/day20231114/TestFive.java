package day20231114;

import java.util.Scanner;

public class TestFive {

    public static void main(String[] args) {
//        在控制台输入一个年龄，若年龄在18岁以上【包含】
//        ，输出成年，若年龄在18岁以下，输出未成年。
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的年龄");
        int age = scanner.nextInt();
        if (age>=18){
            System.out.println("成年");
        }else{
            System.out.println("未成年");
        }
    }
}
