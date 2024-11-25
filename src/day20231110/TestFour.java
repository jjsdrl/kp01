package day20231110;

import java.util.Arrays;
import java.util.Scanner;

public class TestFour {
//    输入三个整数x,y,z，请把这三个数由小到大输出。
    public static void main(String[] args) {

        int x = 100;
        int y = 10;
        int z = 50;


        int []arr = {x,y,z};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        if (x <= y && x <= z){
            System.out.println(x);
            if (y <= z){
                System.out.println(y);
                System.out.println(z);
            }else {
                System.out.println(z);
                System.out.println(y);
            }
        }else if (y <= x && y <= z){
            System.out.println(y);
            if (x <= z){
                System.out.println(x);
                System.out.println(z);
            }else {
                System.out.println(z);
                System.out.println(x);
            }
        }else {
            System.out.println(z);
            if (x <= y){
                System.out.println(x);
                System.out.println(y);
            }else {
                System.out.println(y);
                System.out.println(x);
            }
        }



//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入第一个数");
//        int numOne = scanner.nextInt();
//        System.out.println("请输入第二个数");
//        int numTwo = scanner.nextInt();
//        System.out.println("请输入第三个数");
//        int numThree = scanner.nextInt();
//        int[] arr = new int[]{numOne,numTwo,numThree};
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i+1; j < arr.length; j++) {
//                int temp = arr[i];
//                if (temp > arr[j]){
//                    arr[i] = arr[j];
//                    arr[j] =temp;
//                    temp=arr[i];
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));


    }
}
