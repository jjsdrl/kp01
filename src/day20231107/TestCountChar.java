package day20231107;

import java.util.Scanner;

public class TestCountChar {
    public static void main(String[] args) {
        //统计给定的字符 串中 小写，大写字母 ，数字，特殊字符出现的次数，定义方法实现该功能
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入字符串");
        String str = scanner.next();
        countChar(str);

    }
    public static void countChar(String str){
        char[] arrs = str.toCharArray();
        int numOne = 0;
        int numTwo = 0;
        int numThree = 0;
        int numFour = 0;
        for (int i = 0; i < arrs.length; i++) {
            if (Character.isLowerCase(arrs[i])){
                numOne++;
            }else if (Character.isUpperCase(arrs[i])){
                numTwo++;
            } else if (Character.isDigit(arrs[i])) {
                numThree++;
            }else{
                numFour++;
            }
        }
        System.out.println("小写字母有："+numOne+"个");
        System.out.println("大写字母有："+numTwo+"个");
        System.out.println("数字有："+numThree+"个");
        System.out.println("其他字符有："+numFour+"个");
    }
}
