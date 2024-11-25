package day20230928;

public class TestSum {
    public static void main(String[] args) {
//        10、计算并打印1到100之间所有能被3和5整除的数字之和
        int sum =0;
        for (int i = 1; i < 101; i++) {
            if (i%3==0 &&i%5==0){
                System.out.println(i);
                sum+=i;
            }
        }
        System.out.println("1到100之间所有能被3和5整除的数字之和为："+sum);
    }
}
