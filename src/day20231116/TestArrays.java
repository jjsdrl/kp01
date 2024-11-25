package day20231116;

import java.util.Arrays;

public class TestArrays {
    public static void main(String[] args) {
        int [] arr = {10,20,30,40,50};
        //折半查找
        System.out.println(Arrays.binarySearch(arr, 20));

        //复制数组
//        int[] arrNew = Arrays.copyOf(arr, arr.length);
//        int[] arrNew = Arrays.copyOf(arr, 3);
//        System.out.println(Arrays.toString(arrNew));

        //复制数组中的某一段
//        int[] arrNew = Arrays.copyOfRange(arr, 1,4);
//        System.out.println(Arrays.toString(arrNew));

        //对数组进行排序
        int[] arrNew = {50,20,60,50,30,10};
        Arrays.sort(arrNew);
        System.out.println(Arrays.toString(arrNew));
        char a = '\u0000';
        System.out.println(a);
    }
}
