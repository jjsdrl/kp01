package day20230918;

import java.util.Scanner;

public class TestBlindDate4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("女方问：有房嘛？");
        String answer = scanner.next();
        if ("有".equals(answer)){
            System.out.println("女方问：有车嘛？");
            answer = scanner.next();
            if ("有".equals(answer)){
                    System.out.println("女方问：有存款嘛？");
                    answer = scanner.next();
                    if ("有".equals(answer)){
                        System.out.println("咱们结婚吧！！！");
                    }else {
                        System.out.println("去你家坐坐！！！");
                    }
            }else {
                System.out.println("留个联系方式，下次再聊！！！");
            }
        }else {
            System.out.println("不好意思，家里着火了，要先回去！！！");
        }
    }
}
