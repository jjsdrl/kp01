package day20231010;

import java.util.Scanner;

public class Beauty {

    //有参有返回值的方法
    String marry(double money){
        if (money >= 500000){
            return "大众帕萨特";
        }else if (money >= 100000 && money < 500000){
            return "北京现代";
        }else {
            return "五菱mini";
        }
    }

    //有参无返回值的方法  方法的定义  double money 定义了有个形参（变量），类型为double类型
    void shopping(double money){
        if (money >1000){
            System.out.println("买了一双耐克运动鞋！！！");
            return;
        } else {
            System.out.println("买了一双安踏运动鞋！！！");
        }
    }

//    无参有返回值的方法
    String cooking(){
        return "剁椒鱼头！！！";
    }

//    无参无返回值
    void school(){
        System.out.println("送小孩上学！！！！");
    }
}

class TestBeauty{
    public static void main(String[] args) {

        Beauty beauty = new Beauty();//创建出来的Beauty对象是存储在堆中  而beauty变量名（对象的引用）是存储在栈中
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入你打算给的彩礼");
//        double money = scanner.nextDouble();
//        String result =beauty.marry(money);
//        System.out.println(result);
//        beauty.shopping(money);//方法的调用（会把实参赋值给形参） money 实参
//        System.out.println(beauty.cooking());
        beauty.school();

        int[] array =new int[10];
        System.out.println(array[0]);

    }
}