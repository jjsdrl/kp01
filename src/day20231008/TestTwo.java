package day20231008;

public class TestTwo {
    public static void main(String[] args) {
//        编写一个Java程序，从1开始逐个打印数字，直到打印出100为止。
//        但是对于数字是3的倍数的情况，打印"Fizz"；对于数字是5的倍数的情况，打印"Buzz"；对于同时是3和5的倍数的情况，打印"FizzBuzz"。
        for (int i = 1; i < 101; i++) {


            //只有一行代码的时候可以省略{}
            if (i%3==0&&i%5!=0)
                System.out.print(" "+"Fizz");
            else if (i%5==0&&i%3!=0)
                System.out.print(" "+"Buzz");
            else if (i%3==0&&i%5==0)
                System.out.print(" "+"FizzBuzz");
            else
                System.out.print(" "+i);

        }
    }
}
