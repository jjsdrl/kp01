package day20230919;

public class TestPrimeNumber {
    //打印出1-100以内的所有质数（除了1和该数本身，没有其他的因数）
    public static void main(String[] args) {
//
        for (int i = 2; i <= 100; i++){
//            假设该数是质数
            boolean flag = true;
            for (int j = 2; j < i; j++){
                if (i % j == 0){
                    flag = false;
//                    中断内层for循环
                    break;
                }
            }
            if (flag == true){
                    System.out.println(i);
                }

        }
    }



}
