package day20230928;

import java.util.Scanner;

public class TestFactorial {
    public static void main(String[] args) {
//        计算一个整数的阶乘。



        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你要计算的数");
        int num = scanner.nextInt();
        int result =calc(num);

        System.out.println(result);


//        if (num >0){
//            int sum =1;
//            for (int i = 1; i <= num; i++) {
//                sum *=i;
//            }
//            System.out.println(num+"的阶乘为"+sum);
//        }else if (num ==0){
//            System.out.println("0的阶乘为1");
//        }

//        递归：一个方法自己调用自己（边界条件：决定了递归调用什么时候结束）



    }

    public static int calc(int num){
        if (num == 1){
            return 1;
        }
        return num*calc(num-1);
    }


}
