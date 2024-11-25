package day20231020;

public class Pig {

    //构造方法
    public Pig(){
        System.out.println("构造方法被加载了");
    }

    //代表所有的静态属性，方法，代码块，内部类
    static {
        System.out.println("静态的代码块被加载了");
    }

    //代表所有的非静态属性，方法，代码块，内部类
    {
        System.out.println("非静态的代码块被加载了");
    }

}
class TestPig{
    public static void main(String[] args) {
        new Pig();
    }
}
