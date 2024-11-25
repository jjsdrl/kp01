package day20231225;

import java.util.Scanner;

public class TestThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入需要判断的字符串：");
        String str = scanner.next();
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        if (str.equals(sb.toString()))
            System.out.println("是回文字符串");
        else
            System.out.println("不是回文字符串");
    }
}
