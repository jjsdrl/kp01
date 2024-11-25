package day20230922;

public class TestMaxValue {
    public static void main(String[] args) {
        int[] arr={30,58,12,8,95,75};

//        for (int i =0;i < arr.length;i++){
//            if (arr[i] > arr[0]) {
//                arr[0] = arr[i];
//            }else if (i == arr.length-1){
//                System.out.println("最大值为："+arr[0]);
//            }
//        }

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("最大值为："+max);

    }
}