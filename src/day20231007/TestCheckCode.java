package day20231007;

import java.util.Random;

public class TestCheckCode {
//    void 无返回值
    public static void main(String[] args) {
        System.out.println(getCheckCode());
    }
    public static String getCheckCode(){
        String str ="qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
//        System.out.println(str.charAt(2));//根据给定的下标，返回字符串中该下标对应位置上的字符
        Random random = new Random();//随机类对象
        String result = "";
        for (int i = 0; i < 4; i++) {
            int index = random.nextInt(str.length());//[0,52) 随机出0-51之间的整数
            char c = str.charAt(index);
            result += c;
        }
        result += random.nextInt(10);//[0,10)
        return result;
    }
}