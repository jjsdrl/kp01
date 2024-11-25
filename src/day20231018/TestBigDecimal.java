package day20231018;

import java.math.BigDecimal;

public class TestBigDecimal {
    public static void main(String[] args) {
        System.out.println(2.11-2.10);
        double numOne = 2.11;
        double numTwo = 2.10;
//    把double类型转为String类型  1.Double.toString（num）  2.String.valueOf(num)
        BigDecimal bigDecimalOne = new BigDecimal(String.valueOf(numOne));
        BigDecimal bigDecimalTwo = new BigDecimal(String.valueOf(numTwo));
        BigDecimal result = bigDecimalOne.subtract(bigDecimalTwo);
//        把 BigDecimal 转为double类型
        System.out.println(result.doubleValue());
    }
}
