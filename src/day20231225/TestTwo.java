package day20231225;

import java.util.Scanner;

public class TestTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入需要校验的字符：");
        String str = scanner.next();
        boolean checkStr = checkStr(str);
        if (checkStr==true)
            System.out.println("有效字符");
        else
            System.out.println("无效字符");
    }
    public static boolean checkStr(String str){
        String effectiveStr = "1234567890QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm_";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (effectiveStr.indexOf(ch) == -1 ){
                return false;
            }
        }
        return true;
    }
}