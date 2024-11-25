package day20230927;

import java.util.Random;

public class TestCaptcha {
    public static void main(String[] args) {
        Random random = new Random();
        //随机生成一个6位的验证码，由大写字母，小写字母，数字组成随机组成
        for(int i=0;i<5;i++) {
            if (i == 4) {
                int number = random.nextInt(10);
                System.out.print(number);
            }else if (random.nextInt(2)%2==0){
                char upCode =(char) (random.nextInt(26)+65);
                System.out.print(upCode);
            }else {
                char lowCode = (char) (random.nextInt(26) + 97);
                System.out.print(lowCode);

            }
        }
    }
}
