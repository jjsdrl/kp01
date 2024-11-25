package day20231114;

import java.util.Arrays;
import java.util.Scanner;

public class TestEight {
    public static void main(String[] args) {
//        计算并输出斐波那契数列的前N项值(使用数组实现)。
//        斐波那契数列：1 1 2 3 5 8 13.......
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你想查询第几项");
        int count = scanner.nextInt();
        int[] arr = new int[count];
        int a1 = 1;
        for (int i = 0; i < count; i++) {
            if (i==0 || i ==1){
                arr[i] = a1;
            }else {
                arr[i]= arr[i-1] + arr[i-2];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("第"+count +"项斐波那契数列的值为："+arr[count-1]);
    }
}
