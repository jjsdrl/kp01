package day20230921;

import java.util.Map;

public class TestDaffodil {
    public static void main(String[] args) {
        //水仙花数
//        System.out.print("1000以内的水仙花数有:\n");
//        for (int x = 1;x < 10 ;x++){
//            for (int y = 0;y< 10 ;y++){
//                for (int z = 0;z<10 ;z++){
//                    int sum = x*100 + y*10+z;
//                    int num = x*x*x + y*y*y + z*z*z;
//                    if (sum == num){
//                        System.out.print(num);
//                        System.out.println();
//                    }
//                }
//            }
//        }
        for (int i = 100; i < 1000 ; i++) {
//            获取个位数
            int numOne = i%10;
//            获取十位数
            int numTwo = i/10 %10;
//            获取百位数
            int numThree = i / 100;
            if (Math.pow(numOne,3)+Math.pow(numTwo,3)+ Math.pow(numThree,3) == i ){
                System.out.println(i);
            }
        }
    }
}
