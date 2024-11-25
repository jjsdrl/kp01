package day20231110;

import java.util.Scanner;

public class TestOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入表达式中a的值:");
        int a = scanner.nextInt();
        System.out.print("请输入表达式中的项数：");
        int amount = scanner.nextInt();
        int sum = 0;//总和
        int rank = 1;//表示10的多少次方
        int num = 0;//表示每一项的值
        String procedure = "";
        for (int i = 0; i < amount; i++) {
            num += a * rank;
            rank *=10;
            sum += num;
            procedure +=num+"+";
        }
        System.out.println("总和为"+sum);
        System.out.println("总和为"+ sum + "=" +procedure.substring(0,procedure.length()-1) );
    }
}
