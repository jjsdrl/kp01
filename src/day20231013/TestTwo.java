package day20231013;

import java.util.Random;
import java.util.Scanner;

public class TestTwo {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(100);
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你猜的数");
        int count = 0;
        //猜数游戏
        while (true) {
            System.out.println(num);
            int guess = scanner.nextInt();
            if (guess == num) {
                count++;
                if (count == 1){
                    System.out.println("你太有才了！");
                } else if (count>=2 &&count <=6) {
                    System.out.println("这么快就猜出来了，很聪明么！");
                } else if (count>=7) {
                    System.out.println("猜了半天才猜出来，小同志，尚需努力啊");
                }
                break;
            } else if (guess > num) {
                System.out.println("猜大了");
                count++;
            } else {
                System.out.println("猜小了");
                count++;
            }
        }



    }
}
