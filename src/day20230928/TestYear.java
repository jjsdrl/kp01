package day20230928;

import java.util.Scanner;

public class TestYear {
    public static void main(String[] args) {
//        7、判断一个年份是否是闰年。
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你想判断的年份");
        int year = scanner.nextInt();
        if (year%4==0){
            System.out.println(year+"为闰年");
        }else {
            System.out.println(year+"为平年");
        }
    }
}
