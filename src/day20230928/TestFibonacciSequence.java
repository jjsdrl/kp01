package day20230928;

import java.util.Arrays;
import java.util.Scanner;

public class TestFibonacciSequence {
    public static void main(String[] args) {
//        3、输出斐波那契数列的前20个数字。
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入你要查询第几项的值：");
//        int count = scanner.nextInt();
//        int a = 0;
//        int a1 = 1;
//        int count =20;
//        int arr[] = new int[count];
//        for (int i = 0; i < arr.length; i++) {
//            if (i==0){
//                arr[i] =a1;
//            }else {
//                arr[i] = a + a1;
//                a = a1;
//                a1 = arr[i];
//            }
//        }
//        System.out.println(Arrays.toString(arr));
//        System.out.println("第"+count +"项斐波那契数列的值为："+arr[count-1]);


        System.out.println(caclNum(20));
    }
    //打印出斐波那契数列第20项的值
    public static int caclNum(int num){
        if (num ==1 ||num==2 ){
            return 1;
        }
        return caclNum(num-1)+caclNum(num-2);
    }


}
