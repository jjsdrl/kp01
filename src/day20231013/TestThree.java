package day20231013;

import java.util.Arrays;

public class TestThree{
    public static void main(String[] args) {
        int[] arr = {8,6,59,32,54,68,858,6525,15,2,3,8};
        MaoPao(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void MaoPao(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}


