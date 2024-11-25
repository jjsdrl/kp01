package day20230922;

import java.util.Arrays;

public class TestSort {
    public static void main(String[] args) {
        int[] arr={30,58,12,8,95,75};
        // 外层for循环的次数由整个数组中需要固定的位置个数决定，6个元素，需要固定5次
        for (int i = 0; i < arr.length - 1; i++) {
            // 内层for循环的次数由从还未找到位置的剩下元素中，需要比较多少次，才能找到他们的最大值来决定
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j+1] > arr[j]) { //相邻元素两两比较
                    //变量值交换位置
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }

        }
//        for (int i =0;i< arr.length;i++){
//            System.out.println(arr[i]);
//        }
        System.out.println(Arrays.toString(arr));
    }
}
