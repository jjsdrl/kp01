package day20231008;

import java.util.Scanner;

public class TestSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要计算的尾数为");
        int num = scanner.nextInt();


        System.out.println("1~"+num+"之内所有整数和为："+calcSum(num));

    }

    public static int calcSum(int num){
        if (num ==1){
            return 1;
        }
        return num +calcSum(num-1);
    }

}
