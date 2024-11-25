package day20231020;

import java.util.Scanner;

public class TestCalculate {

    static Scanner scanner = new  Scanner(System.in);
    static String procedure="";
    //新的运算
    public static double newCalculate(){
        System.out.print("请输入第一个整数：");
        int numOne = scanner.nextInt();
        System.out.println("请输入运算符号：1（+），2（-），3（*），4（/）:");
        int oper = scanner.nextInt();
        System.out.print("请输入第二个整数：");
        int numTwo = scanner.nextInt();
        double result = 0;
        String ch="";
        if (oper==1){
            result = numOne +numTwo;
            ch="+";
        }else if (oper==2){
            result = numOne -numTwo;
            ch="-";
        }else if (oper==3){
            result = numOne *numTwo;
            ch="*";
        }else if (oper==4){
            result = numOne /numTwo;
            ch="/";
        }
        System.out.println(result);
        procedure = "("+numOne + ch+ numTwo+")";
        System.out.println(procedure);
        return result;
    }
    //继续运算
    public static double continueCalculate(double numOne){
        System.out.println("请输入运算符号：1（+），2（-），3（*），4（/）:");
        int oper = scanner.nextInt();
        System.out.print("请输入第二个整数：");
        int numTwo = scanner.nextInt();
        double result = 0;
        String ch="";
        if (oper==1){
            result = numOne +numTwo;
            ch="+";
        }else if (oper==2){
            result = numOne -numTwo;
            ch="-";
        }else if (oper==3){
            result = numOne *numTwo;
            ch="*";
        }else if (oper==4){
            result = numOne /numTwo;
            ch="/";
        }
        System.out.println(result);
        procedure = "("+procedure + ch+ numTwo+")";
        System.out.println(procedure);
        return result;
    }
    public static void main(String[] args) {
        System.out.println("欢迎使用控制台计算器");
        double result = newCalculate();
        while (true){
            System.out.print("1（继续) 2（退出） 3（清空）");
            int choice = scanner.nextInt();
            if (choice == 1 ){
                result=continueCalculate(result);
            }else if (choice == 2 ){
                System.out.println("感谢使用！");
                break;
            }else {
                System.out.println("已清空历史记录，请继续使用！！！！");
                result = newCalculate();
            }

        }
    }
}
