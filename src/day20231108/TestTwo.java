package day20231108;


import java.util.Scanner;

public class TestTwo {

//    1、求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。例如2+22+222+2222+22222(此时共有5个数相加)，几个数相
//
//    加由键盘通过Scanner对象进行控制。
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("请输入一个数字:");
    int num = scanner.nextInt();
    System.out.print("请输入你想相加的个数：");
    int count = scanner.nextInt();
    int sum=0;
    String str = "0";
    String x = " " ;
    for (int i = 0; i < count; i++) {
        str +=num;
        sum+=Integer.parseInt(str);
        if (i==0){
            x = ""+Integer.parseInt(str);
        }else {
            x = x + "+"+ Integer.parseInt(str);
        }


    }
    System.out.println(x +"="+sum);
}
}
