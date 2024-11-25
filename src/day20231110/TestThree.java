package day20231110;

public class TestThree {

//    1、有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？
    public static void main(String[] args) {
        int num = 0;
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                for (int k = 1; k < 5; k++) {
                    if (i != j && i != k && j != k )
                        System.out.print(i*100+j*10+k +",");
                            num++;
                }
            }
        }
        System.out.println();
        System.out.println("一共有"+num+"个");
    }
}
