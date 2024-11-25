package day20230920;

public class TestBreakOne {
    public static void main(String[] args) {
        //外层for循环控制打印的行数（行），内层for循环控制每行打印的*的数量（列）
        outer:
        for (int i=1 ; i <= 10;i++){
            //                给循环取名字
            inner:
            for (int j =1; j <= 5; j++){
                if (i == 5 && j == 4){
//                    跳出了内层for循环
//                    break inner;
//                    外层
                    break outer;
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
