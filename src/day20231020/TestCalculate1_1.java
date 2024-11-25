package day20231020;

import java.util.Scanner;

public class TestCalculate1_1 {
    static Scanner scanner = new  Scanner(System.in);
    static String procedure="";
    static double result = 0;
    static String ch="";
    static double numTwo;
    static double numOne;
    public static void commonCalculate(){
        System.out.println("请输入运算符号：1（+），2（-），3（*），4（/）:");
        int oper = scanner.nextInt();
        System.out.print("请输入第二个整数：");
        numTwo = scanner.nextInt();
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
    }
    //新的运算
    public static void newCalculate(){
        System.out.print("请输入第一个整数：");
        numOne = scanner.nextInt();
        commonCalculate();
        System.out.println(result);
        procedure = "("+numOne + ch+ numTwo+")";
        System.out.println(procedure);
    }
    //继续运算
    public static void continueCalculate(){
        numOne = result;
        commonCalculate();
        System.out.println(TestCalculate1_1.result);
        procedure = "("+procedure + ch+ numTwo+")";
        System.out.println(procedure);
    }
    public static void main(String[] args) {
        System.out.println("欢迎使用控制台计算器");
        newCalculate();
        while (true){
            System.out.print("1（继续) 2（退出） 3（清空）");
            int choice = scanner.nextInt();
            if (choice == 1 ){
                continueCalculate();
            }else if (choice == 2 ){
                System.out.println("感谢使用！");
                break;
            }else {
                System.out.println("已清空历史记录，请继续使用！！！！");
                newCalculate();
            }
        }
    }
}
