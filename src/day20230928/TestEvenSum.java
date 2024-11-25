package day20230928;

public class TestEvenSum {
    public static void main(String[] args) {
//        1、计算1到100的所有偶数的和。
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i%2==0){
                sum +=i;
//                System.out.println(i);
            }
        }
        System.out.println("1到100的所有偶数的和为："+sum);
    }
}