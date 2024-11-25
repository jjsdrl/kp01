package day20231007;

import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 49, 56, 89};
        int newArr[] = new int[arr.length];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        System.out.println(Arrays.toString(newArr));
    }
}
