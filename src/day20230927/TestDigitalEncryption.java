package day20230927;


public class TestDigitalEncryption {
    public static void main(String[] args) {
        System.out.println(encryption(1983));//实参（有实际值的变量或者是值） 形参（变量名）


            }

    public static int encryption(int oldNumber){
        //获取个位数
        int numOne = oldNumber % 10;
        //获取十位数
        int numTwo = oldNumber / 10 % 10;
        //获取百位数
        int numThree = oldNumber / 100 % 10;
        //获取千位数
        int numFour = oldNumber / 1000;

        numOne =( numOne + 5 ) % 10;
        numTwo =( numTwo + 5 ) % 10;
        numThree =( numThree + 5 ) % 10;
        numFour =( numFour + 5 ) % 10;

        int result = numOne * 1000 + numTwo * 100 + numThree * 10 + numFour*1;
        return result;
    }
}

