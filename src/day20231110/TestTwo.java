package day20231110;

import java.util.Scanner;

public class TestTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入");
        String str = scanner.next();
        countChar(str);
    }
    public static void countChar(String str){
        char[] arrs = str.toCharArray();
        int numOne = 0;
        for (int i = 0; i < arrs.length; i++) {
            if (Character.isLowerCase(arrs[i]) || Character.isUpperCase(arrs[i]) || Character.isDigit(arrs[i]) || arrs[i]=='_'){

            }else {
                System.out.println("无效字符："+arrs[i]);
                numOne++;
            }
        }
        if (numOne>0){
            System.out.println("该字符串为无效字符串");
        }else {
            System.out.println("该字符串为有效字符串");
        }
    }
}
