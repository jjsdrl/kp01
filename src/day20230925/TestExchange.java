package day20230925;

import java.util.Scanner;

public class TestExchange {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        不借助第三个变量，对numOne和numTwo的值进行交换
        System.out.println("请输入第一个数：");
        int numOne = scanner.nextInt();
        System.out.println("请输入第二个数：");
        int numTwo = scanner.nextInt();

//        numOne = numTwo + numOne; //numOne = 30    numTwo = 10
//        numTwo = numOne -numTwo;//numOne = 30    numTwo = 20
//        numOne = numOne -numTwo;//numOne = 10    numTwo = 20

        numOne = numTwo * numOne;
        numTwo = numOne /numTwo;
        numOne = numOne /numTwo;
//        System.out.println("交换前：");
//        System.out.println("numOne = " + numOne);
//        System.out.println("numTwo = " + numTwo);
//
//        // 交换变量的值
//        numOne = numOne ^ numTwo;
//        numTwo = numTwo ^ numOne;
//        numOne = numOne ^ numTwo;
//
        System.out.println("交换后：");
        System.out.println("numOne = " + numOne);
        System.out.println("numTwo = " + numTwo);
    }
}
