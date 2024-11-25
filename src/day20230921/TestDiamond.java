package day20230921;

import java.util.Scanner;

public class TestDiamond {
    public static void main(String[] args) {
//        for (int i = 1;i <=10 ; i++){
//            for (int j = 1;j<=10- i ;j++){
//                System.out.print("\t");
//            }
//            for (int k = 1;k<=2*i-1;k++) {
//                System.out.print("\t"+"*");
//            }
//            System.out.println();
//        }
//
//        for (int i = 9;i >=1 ; i--){
//            for (int j = 10- i;j >= 1 ;j--){
//                System.out.print("\t");
//            }
//            for (int k = 2*i- 1;k>=1;k--){
//                System.out.print("\t"+"*");
//            }
//            System.out.println();
//        }


//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入菱形的边缘的星星个数：");
//        int num = scanner.nextInt();
//        for (int i = 1; i <= num ; i++){
//            //打印空格的个数
//            for (int j = 1 ; j <= num - i ; j++){
//                System.out.print(" ");
//            }
//            //打印星星的个数
//            for (int k = 1 ; k <= i ; k++){
//                if (k == 1 || k ==i) {
//                    System.out.print(" " + "*");
//                }else {
//                        System.out.print("  ");
//                }
//
//            }
//            //换行
//            System.out.println();
//        }
//
//
//        for (int i = 1; i< num;i++){
//            for (int j = 1; j<= i; j++){
//                System.out.print(" ");
//            }
//            for (int k =1;k<=num -i;k++){
//                if (k == 1 || k ==num-i) {
//                    System.out.print(" " + "*");
//                }else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }


//        for (int i = num ; i >= 1 ; i--){
//            //打印空格的个数
//            for (int j = num -1 ; j >=  i ; j--){
//                System.out.print(" ");
//            }
//            for (int k = i ; k >= 1 ; k--){
//                if (k == 1 || k ==i) {
//                    System.out.print(" " + "*");
//                }else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }


//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入菱形边缘星星的个数");
//        int num = scanner.nextInt();
//        for (int i =1; i <= num; i++){
//            for (int j = 1; j <= num - i;j++){
//                System.out.print(" ");
//            }
//            for (int k = 1; k <= i ; k++){
//                System.out.print(" *");
//            }
//            System.out.println();
//        }
//
//        for (int i =num - 1; i >= 1; i--){
//            for (int j = num - i; j >= 1;j--){
//                System.out.print(" ");
//            }
//            for (int k = i; k >= 1 ; k--){
//                System.out.print(" *");
//            }
//            System.out.println();
//        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入菱形边缘星星的个数");
        int num = scanner.nextInt();
        for (int i =1; i <= num; i++){
            for (int j = 1; j <= num - i;j++){
                System.out.print(" ");
            }
            for (int k = 1; k <= i ; k++){
                if (k == 1||k==i){
                    System.out.print(" *");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        for (int i =num - 1; i >= 1; i--){
            for (int j = num - i; j >= 1;j--){
                System.out.print(" ");
            }
            for (int k = i; k >= 1 ; k--){
                if (k == 1||k==i){
                    System.out.print(" *");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
