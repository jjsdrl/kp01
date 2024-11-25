package day20230928;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class TestCommont {
    public static void main(String[] args) {
//        6、找出数组中的重复元素。
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入你想判断的数的个数");
//        int count = scanner.nextInt();
//        int arr[] = new int[count];
//        for (int i = 0; i < count; i++) {
//            System.out.println("请输入第"+(i +1 )+"个数");
//            arr[i] = scanner.nextInt();
//        }
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i+1; j < count; j++) {
//                int temp = arr[i];
//                if (temp > arr[j]){
//                    arr[i] = arr[j];
//                    arr[j] =temp;
//                    temp=arr[i];
//                }
//            }
//        }
//        System.out.println("你输入的数组为："+Arrays.toString(arr));
//        //数据暂存
//        int temp =0;
//        //重复次数
//        int count1 = 1;
//        //打印次数
//        int count3 = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (temp == arr[i]){
//                if (count3==0) {
//                    System.out.println("数组中的元素”" + temp + "“重复了" + count1 + "次");
//                    count3++;
//                }
//            }else {
//                count1 =1;
//                count3=0;
//                temp = arr[i];
//                for (int j = i+1; j < arr.length; j++) {
//                    if (temp == arr[j]){
//                        count1++;
//                    }
//                }
//            }
//        }

        //java中的集合List,Set(HashSet,存储的元素是无序不可重复的),Map
        HashSet<Integer> set = new HashSet();
        int arr[]={8,15,8,19,15,8};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] ==arr[j]){
//                    System.out.println(arr[i]);
                    set.add(arr[i]);
                    break;
                }
            }
        }
        set.forEach(System.out::println);
    }
}
