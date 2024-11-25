package day20230927;

import java.util.Arrays;

public class TestSelect{
    /*
    * [6, 86, 10, 58, 46, 25]  6 排好了位置
    * [6, 10, 86, 58, 46, 25]  6, 10 排好了位置
    * [6, 10, 25, 58, 46, 86]  6, 10, 25 排好了位置
    * [6, 10, 25, 46, 58, 86]  6, 10, 25, 46 排好了位置
    * [6, 10, 25, 46, 58, 86]  6, 10, 25, 46, 58 排好了位置
    *
    *
    * */
    public static void main(String[] args) {
        int arr[] = {10,86,6,58,46,25};
        for (int i =0 ;i <arr.length-1;i++){
            int minIndex =i;//假设最小值的小标为i
               for (int j = i+1;j<arr.length;j++){
                   if (arr[minIndex]>arr[j]){
                       minIndex =j;//用minIndex记录最小值的下标
                   }
               }
               //交换位置把minIndex下标所对应的元素和i下标所对应的元素进行交换位置
            int temp =arr[minIndex];
            arr[minIndex] =arr[i];
            arr[i] = temp;
            System.out.println(Arrays.toString(arr));
        }

    }
}
