package day20231120;
//方法的泛型
public class Testmethod {
    public static void main(String[] args) {
        calculate("abc");
        calculate(10);
    }
    public static <T> void calculate(T t ){
        System.out.println(t);
    }

}
