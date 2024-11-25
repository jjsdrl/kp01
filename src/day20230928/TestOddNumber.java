package day20230928;

import java.util.Scanner;

public class TestOddNumber {
    public static void main(String[] args) {
//        8、找出一个数组中的所有奇数。
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你想判断的数的个数");
        int count = scanner.nextInt();
        int arr[] = new int[count];
        for (int i = 0; i < count; i++) {
            System.out.println("请输入第"+(i +1 )+"个数");
            arr[i] = scanner.nextInt();
        }
        System.out.println("奇数有：");
        for (int i = 0; i < count; i++) {
            if (arr[i]%2!=0){
                System.out.println(arr[i]+",");
            }
        }
    }
}
