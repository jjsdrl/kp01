package day20231114;

import java.util.Scanner;

public class TestOne {
    public static void main(String[] args) {
//        在控制台输入一个数，若为正数，输出正数，若为负数，输出负数，否则输出0。
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数");
        int num = scanner.nextInt();
        if (num > 0){
            System.out.println("正数");
        }else if(num < 0 ){
            System.out.println("负数");
        }else {
            System.out.println(0);
        }
        
    }
}
