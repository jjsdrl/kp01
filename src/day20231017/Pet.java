package day20231017;

public class Pet {
    static {
        System.out.println("执行了静态的代码块！！！");
    }
    {
        System.out.println("执行了非静态的代码块！！！！");
    }

    public static void main(String[] args) {
        new Pet();
    }
}
