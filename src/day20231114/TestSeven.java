package day20231114;

import java.util.Random;

public class TestSeven {
    public static void main(String[] args) {
//        从给定的字符串“ABCDEFG12345678”中随机获取出4个字符拼接成一个验证码输出
        String str = "ABCDEFG12345678";
        for (int i = 0; i < 4; i++) {
            Random random = new Random();
            char ch = str.charAt(random.nextInt(str.length()));
            System.out.print(ch);
        }
    }
}
