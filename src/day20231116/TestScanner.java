package day20231116;

import java.util.Scanner;

public class TestScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //hasNext（）判断输入的值是否为整数
        if (scanner.hasNextInt()){
            //nextInt()用来获取整个整数
            int num = scanner.nextInt();
            System.out.println("是整数");
        }else {
            System.out.println("不是整数");
        }

    }
}
