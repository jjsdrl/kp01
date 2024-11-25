package day20230920;

public class TestContinue {
    public static void main(String[] args) {
        //循环打印1-100以内的所有数值，若遇到5的倍数，则不打印
        for (int i = 1;i <= 100;i++){
            if (i % 5 == 0){
//                结束本次循环，继续执行下一次循环
                continue;
            }
            System.out.print(i+",");
        }
    }
}
