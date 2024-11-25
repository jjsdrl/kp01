package day20231018;

import java.util.Scanner;

public class TestCalculate {
    public static void main(String[] args) {
        //定义一个方法，实现计算器的功能（输入参与计算的两个值以及一个运算符，得到计算后的结果）
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数");
        double numOne = scanner.nextDouble();
        System.out.println("请输入运算符号（+，-，*，/，%）");
        String oper = scanner.next();
        System.out.println("请输入第二个数");
        double numTwo = scanner.nextDouble();
        if (numTwo==0&&oper.equals("/")){
            System.out.println("除数不能为0");

        }else {
            double result = calculate(numOne,oper,numTwo);
            System.out.println(numOne+oper+numTwo+"="+result);
        }


    }
    //有参有返回值的方法
    public static double calculate(double numOne,String oper,double numTwo){
        double result = 0.0;
        if (oper.equals("/")){
            result = numOne/numTwo;
        }else if(oper.equals("*")){
            result = numOne*numTwo;
        }else if(oper.equals("+")){
            result = numOne+numTwo;
        }else if(oper.equals("-")){
            result = numOne-numTwo;
        }else if(oper.equals("%")){
            result = numOne%numTwo;
        }
        return result;
    }
}
