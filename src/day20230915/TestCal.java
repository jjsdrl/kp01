package day20230915;

import com.sun.corba.se.spi.presentation.rmi.IDLNameTranslator;

public class TestCal {
    public static void main(String[] args) {
        int numOne = 100;
//        char类型提升为int类型，得到的是该字符的unicode编码值
        char ch = 'A';
        System.out.println(70%20);
        System.out.println(numOne+ch);
        int a=3,b=2;
        a*=b+8;
        System.out.println(a);
    }
}
