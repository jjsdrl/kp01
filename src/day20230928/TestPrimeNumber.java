package day20230928;

import java.util.Scanner;

public class TestPrimeNumber {
    public static void main(String[] args) {
//        2、判断一个数是否为素数。
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你要判断的数：");
        int num = scanner.nextInt();
        boolean flag = true;
        for (int i = 2; i < num; i++) {
            if (num%i==0){
                flag = false;
                break;
            }
        }
        if (flag){
            System.out.println(num+"是素数");
        }else {
            System.out.println(num+"不是素数");
        }
    }
}
