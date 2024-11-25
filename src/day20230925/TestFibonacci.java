package day20230925;

import java.util.Arrays;
import java.util.Scanner;

public class TestFibonacci {
    public static void main(String[] args) {
        //斐波那契数列 1 1 2 3 5 8 13......计算斐波那契数列的第20的值，并打印出来
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("你想查询第几项的斐波那契数列值？");
//        int count = scanner.nextInt();
//
//        int[] arr = new int[count];
//        int a=0;
//        int a1=1;
//        for (int i = 0; i < count; i++) {
//            if (i == 0){
//                arr[i] = a1;
//            }else {
//                int temp = a1;
//                a1 = a1 + a;
//                a = temp;
//                arr[i] = a1;
//            }
//        }
//        System.out.println(Arrays.toString(arr));
//        System.out.println("第"+count+"项斐波那契数列的值为"+arr[count-1]);
        int []arr = new int[20];
        arr[0]=1;
        arr[1]=1;
        for (int i = 2;i<20;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("第"+arr.length +"项斐波那契数列的值为"+arr[arr.length-1]);
    }
}
