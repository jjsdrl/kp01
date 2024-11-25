package day20230927;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TestJudgeScore {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        double arr[]= new double[6];
//        double scoreOne = 0;
//        for (int i = 0; i < 6; i++) {
//            System.out.println("请输入第"+(i+1)+"位评委的打分");
//           double score = scanner.nextDouble();
//           if (score<=100 &&score>=0){
//               arr[i]=score;
//           }else {
//               System.out.println("您输入的分数出错了，请重新输入！！！");
//               break;
//           }
//        }
//        for (int i =0 ;i <arr.length-1;i++){
//            int minIndex =i;//假设最小值的小标为i
//            for (int j = i+1;j<arr.length;j++){
//                if (arr[minIndex]>arr[j]){
//                    minIndex =j;//用minIndex记录最小值的下标
//                }
//            }
//            //交换位置把minIndex下标所对应的元素和i下标所对应的元素进行交换位置
//            double temp =arr[minIndex];
//            arr[minIndex] =arr[i];
//            arr[i] = temp;
//        }
//        for (int i = 1; i < arr.length-1 ; i++) {
//            scoreOne+=arr[i];
//
//
//        }
//        scoreOne = scoreOne/(arr.length-2);
//        System.out.println("去掉一位最大值和一位最小值之后，得分结果为"+scoreOne);
//
//    }

    public static void main(String[] args) {
        int arr[] =new int[6];
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            int score = random.nextInt(101);
            arr[i] = score;
        }
        Arrays.sort(arr);//排序
        System.out.println(Arrays.toString(arr));
        int sum = 0;
        for (int i = 1; i < arr.length-1; i++) {
            sum+=arr[i];
        }
        System.out.println(sum/(arr.length-2.0));//提升数据类型为double
    }
}
