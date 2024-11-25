package day20230928;

public class TestAverage {
    public static void main(String[] args) {
//        11、计算并打印1到100之间所有奇数的平均值。
        int sum = 0;
        int count =0;
        for (int i = 1; i <101 ; i++) {
            if (i%2!=0){
                sum+=i;
                count++;
            }
        }
        System.out.println("1到100之间所有奇数的平均值为："+(sum/(count*1.0)));
    }
}