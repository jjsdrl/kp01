package day20231225;

import java.util.Scanner;

public class TestFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入你需要查询的项数：");
        int num = scanner.nextInt();
        System.out.println("斐波那契数列第"+num+"项的值为"+caclNum(num));
    }

    public static int caclNum(int num){
        if (num ==1 ||num==2 ){
            return 1;
        }
        return caclNum(num-1)+caclNum(num-2);
    }
}
