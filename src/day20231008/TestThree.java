package day20231008;

import java.util.Arrays;
import java.util.Scanner;

public class TestThree {
    public static void main(String[] args) {
        //编写一个Java程序，接受一个整数作为输入，然后判断它是否是回文数（正读和反读都相同，例如121或1331）。
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个大于0的整数");
        int num = scanner.nextInt();
        //12345
        /*
        * num/1 %10 （5）
        * num/10 %10 （4）
        * num/100 %10 （3）
        * num/1000 %10 （2）
        * num/10000 %10 （1）
        *
        * */
        int length = (num+"").length();
        int rank = 1;
        int arr[]=new int[length];
        int x = 0;
        for (int i = 0;i<length;i++){
            int result = num / rank  %10;
            arr[i] = (int) (result * Math.pow(10,length-i-1));
//            arr[i] = result;
            x+=arr[i];
            rank*=10;
        }
//        System.out.println(Arrays.toString(arr));
//        System.out.println(x);
        if (num==x){
            System.out.println(num+"为回文数");
        }else {
            System.out.println(num+"不是回文数");
        }


//        boolean flag = true;
//        for (int i = 0;i<arr.length/2;i++){
//            if (arr[i]!=arr[arr.length-i-1]){
//                flag=false;
//                break;
//            }
//        }
//        if (flag){
//            System.out.println(num+"为回文数");
//        }else {
//            System.out.println(num+"不是回文数");
//        }


//        int newNum = 0;
//        int x = num;
//        while (x>0){
//            newNum*=10;
//            newNum+=x%10;
//            x= x/10;
//        }
//        if (num == newNum){
//            System.out.println(num+"为回文数");
//        }else {
//            System.out.println(num+"不是回文数");
//        }

    }
}
