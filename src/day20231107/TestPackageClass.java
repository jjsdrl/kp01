package day20231107;

public class TestPackageClass {
    public static void main(String[] args) {
        Byte aByte = new Byte((byte)100);
        byte bByte = 100;
        Byte cByte = 100;


        //自动装箱
        Integer numOne = 100;   //numOne 存储在常量池中
        //自动拆箱
        int numTwo  = numOne;

        Integer numThree = new Integer(100);    //numThree 存储在堆中
        System.out.println(numThree==numOne);   //false
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);


        //把Integer类型的对象转为其他基本类型
        Integer num = 100;
        double numFour = num.doubleValue();
        double numFive = num.shortValue();
        System.out.println(numFour);

        //把Integer类型的对象转为字符串类型
        Integer x = 100;
        String str = num.toString();
        System.out.println(str);
        //把字符串类型转为Integer类型
        Integer y = Integer.valueOf("200");
        System.out.println(y);
        //把字符串类型转为int类型
        int z = Integer.parseInt("100");
        System.out.println(z);


        Integer a = 300;
        Integer b = 300;
        Integer c = 100;
        Integer d = 100;

        //享元模式 减少内存占用 提高性能 -128 ~ 127
        System.out.println(a == b);
        System.out.println(c == d);


    }
}
