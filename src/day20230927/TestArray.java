package day20230927;

import java.util.Arrays;
import java.util.Scanner;

public class TestArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你想输入数组的个数");

        int count = scanner.nextInt();
        int arr[] = new int[count];
        int brr[] = new int[count];
        System.out.println("未输入的数组arr"+Arrays.toString(arr));
        System.out.println("未输入的数组brr"+Arrays.toString(brr));
        for (int i = 0; i < count; i++) {
            System.out.println("请输入第"+(i+1)+"个数");
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < count; i++) {
            brr[i]=arr[i];
        }

        System.out.println("您输入的数组arr为"+ Arrays.toString(arr));
        System.out.println("复制后的数组brr为"+Arrays.toString(brr));


    }

}
