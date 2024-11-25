package day20230927;

import java.util.Scanner;

public class TestDigitalDecryption {
    public static void main(String[] args) {
        System.out.println(decryption(8346));
    }
    public static int decryption(int oldNumber){
        //获取个位数
        int numOne = oldNumber % 10;
        //获取十位数
        int numTwo = oldNumber / 10 % 10;
        //获取百位数
        int numThree = oldNumber / 100 % 10;
        //获取千位数
        int numFour = oldNumber / 1000;


        /*
        * 1 +5  % 10 ===> 6
        * 9 +5  % 10 ===> 4
        * 8 +5  % 10 ===> 3
        * 3 +5  % 10 ===> 8
        * */


        //若余数大于5则原始值为余数-5，否则原始值为余数+10-5
        numOne = numOne > 5 ?numOne-5:numOne+10-5;
        numTwo = numTwo > 5 ?numTwo-5:numTwo+10-5;
        numThree = numThree > 5 ?numThree-5:numThree+10-5;
        numFour = numFour > 5 ?numFour-5:numFour+10-5;

        int result = numOne * 1000 + numTwo * 100 + numThree * 10 + numFour*1;
        return result;
    }
}

