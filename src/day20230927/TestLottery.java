package day20230927;

import java.util.Arrays;
import java.util.Random;

public class TestLottery {
    public static void main(String[] args) {
        Random random = new Random();
        int arr[]=new int[]{2, 588 , 888, 1000, 10000};


//        for (int i = 0; i < arr.length; i++) {
//            int newArr[] = new int[arr.length-1-i];
//            int count = random.nextInt(newArr.length+1);
//            System.out.println(arr[count]+"元奖励，已被抽出！！！");
//            for (int j = 0; j < count; j++) {
//                newArr[j] = arr[j];
//            }
//            for (int j = count; j < newArr.length; j++) {
//                newArr[j] = arr[j+1];
//            }
//            for (int j = 0; j < newArr.length; j++) {
//                arr[j] = newArr[j];
//            }
//
//            System.out.println("覆盖后数组"+Arrays.toString(arr));
//            System.out.println("生成的数组"+Arrays.toString(newArr));
//            System.out.println();
//        }





        int length = arr.length;
        while (length>0){
            int index = random.nextInt(length);
            System.out.println(arr[index]+"元的奖金被抽出！！！");
            for (int i = index; i < length-1 ; i++) {
                arr[i]=arr[i+1];
            }
            length--;
        }







    }
}

