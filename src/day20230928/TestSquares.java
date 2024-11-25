package day20230928;

public class TestSquares {
    public static void main(String[] args) {
//        9、计算并打印1到100之间所有整数的平方和。
        int sum = 0;
        for (int i = 1; i < 101; i++) {
            sum += i*i;
        }
        System.out.println("1到100之间所有整数的平方和为："+sum);
    }
}
