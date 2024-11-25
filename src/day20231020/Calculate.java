package day20231020;

import java.util.Scanner;

public class Calculate {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*****************************");
        System.out.println("*          计算器            *");
        System.out.println("*       作者：郑皓月          *");
        System.out.println("*****************************");
        int numOne = 0 ;
        int numTwo = 0;
        int oper = 0;
        int num=0;
        int next= 0;
        String fangFa="";
        System.out.print("请输入第一个整数:");
        numOne = scanner.nextInt();
        System.out.println("请输入运算符号：1（+），2（-），3（*），4（/）");
        System.out.print("您选择的运算为:");
        oper = scanner.nextInt();
        System.out.print("请输入第二个整数:");
        numTwo = scanner.nextInt();
        for (next = 0;next !=2;) {
            if (next==1){
                numOne=num;
                System.out.println("请输入运算符号：1（+），2（-），3（*），4（/）");
                System.out.print("您选择的运算为:");
                oper = scanner.nextInt();
                System.out.print("请输入一个整数:");
                numTwo = scanner.nextInt();
                if (oper==1){
                    fangFa="("+fangFa+"+"+numTwo+")";
                    num=jia(numOne,numTwo);
                }else if (oper==2){
                    fangFa="("+fangFa+"-"+numTwo+")";
                    num=jian(numOne,numTwo);
                }else if (oper==3){
                    fangFa="("+fangFa+"*"+numTwo+")";
                    num=chen(numOne,numTwo);
                }else if (oper==4){
                    if (numTwo==0){
                        System.out.println("除数不能为0");
                        System.out.println();
                        System.out.print("请输入一个整数（不能为0）:");
                        numTwo = scanner.nextInt();
                    }
                    fangFa="("+fangFa+"/"+numTwo;
                    num=chu(numOne,numTwo);
                }
            }else if (next==3){
                System.out.print("请输入第一个整数:");
                numOne = scanner.nextInt();
                System.out.println("请输入运算符号：1（+），2（-），3（*），4（/）");
                System.out.print("您选择的运算为:");
                oper = scanner.nextInt();
                System.out.print("请输入第二个整数:");
                numTwo = scanner.nextInt();
                if (oper==1){
                    fangFa="("+numOne+"+"+numTwo+")";
                    num=jia(numOne,numTwo);
                }else if (oper==2){
                    fangFa="("+numOne+"-"+numTwo+")";
                    num=jian(numOne,numTwo);
                }else if (oper==3){
                    fangFa="("+numOne+"*"+numTwo+")";
                    num=chen(numOne,numTwo);
                }else if (oper==4){
                    if (numTwo==0){
                        System.out.println("除数不能为0");
                        System.out.println();
                        System.out.print("请输入第二个整数（不能为0）:");
                        numTwo = scanner.nextInt();
                    }
                    fangFa="("+numOne+"/"+numTwo+")";
                    num=chu(numOne,numTwo);
                }
            } else if (next==0){
                if (oper==1){
                    fangFa="("+numOne+"+"+numTwo+")";
                    num=jia(numOne,numTwo);
                }else if (oper==2){
                    fangFa="("+numOne+"-"+numTwo+")";
                    num=jian(numOne,numTwo);
                }else if (oper==3){
                    fangFa="("+numOne+"*"+numTwo+")";
                    num=chen(numOne,numTwo);
                }else if (oper==4){
                    if (numTwo==0){
                        System.out.println("除数不能为0");
                        System.out.println();
                        System.out.print("请输入第二个整数（不能为0）:");
                        numTwo = scanner.nextInt();
                    }
                    fangFa="("+numOne+"/"+numTwo+")";
                    num=chu(numOne,numTwo);
                }
            }
            System.out.print(fangFa+"=");
            System.out.println(num);
            System.out.println();
            System.out.println("1（继续) 2（退出） 3（清空）");
            next = scanner.nextInt();
        }
        System.out.println("谢谢您的使用！！！");
    }
    static  int jia(int numOne,int numTwo){
        int answer;
        answer = numOne + numTwo;
        return answer;
    }
    static int jian(int numOne,int numTwo){
        int answer;
        answer = numOne - numTwo;
        return answer;
    }
    static int chen(int numOne,int numTwo){
        int answer;
        answer = numOne * numTwo;
        return answer;
    }
    static int chu(int numOne,int numTwo){
            int answer;
            answer = numOne / numTwo;
            return answer;
    }
}
