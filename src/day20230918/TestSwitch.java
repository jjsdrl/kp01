package day20230918;

import java.util.Scanner;

public class TestSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入当前的月份");
        int month = scanner.nextInt();
        /*switch (month){
            case 3:
                System.out.println("春季");break;
            case 4:
                System.out.println("春季");break;
            case 5:
                System.out.println("春季");break;
            case 6:
                System.out.println("夏季");break;
            case 7:
                System.out.println("夏季");break;
            case 8:
                System.out.println("夏季");break;
            case 9:
                System.out.println("秋季");break;
            case 10:
                System.out.println("秋季");break;
            case 11:
                System.out.println("秋季");break;
            case 12:
                System.out.println("冬季");break;
            case 1:
                System.out.println("冬季");break;
            case 2:
                System.out.println("冬季");break;
            default:
                System.out.println("请输入正常的月份：[1-12]");break;

        }*/

        String season = "";
        switch (month){
            case 3:
            case 4:
            case 5:
                season="春季";break;
            case 6:
            case 7:
            case 8:
                season="夏季";break;
            case 9:
            case 10:
            case 11:
                season="秋季";break;
            case 12:
            case 1:
            case 2:
                season="冬季";break;
            default:
                season="火星季节";break;
        }
        System.out.println(season);
    }
}
