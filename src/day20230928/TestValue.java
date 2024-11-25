package day20230928;

import java.util.Arrays;
import java.util.Scanner;

public class TestValue {
    public static void main(String[] args) {
//        找出数组中的最大值和最小值。
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你想判断的数的个数");
        int count = scanner.nextInt();
        int arr[] = new int[count];
        for (int i = 0; i < count; i++) {
            System.out.println("请输入第"+(i +1 )+"个数");
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < count; j++) {
                int temp = arr[i];
                if (temp > arr[j]){
                    arr[i] = arr[j];
                    arr[j] =temp;
                    temp=arr[i];
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("上面数组中最大值为"+arr[count-1]);
        System.out.println("上面数组中最小值为"+arr[0]);
    }
}
