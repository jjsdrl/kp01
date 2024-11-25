package day20231017;

public class Pig {
    final String pingName ="汪乔";//final修饰的变量是一个常量
    public final static  int PIG_AGE= 20; //public final static 顺序无关
     static  public void  main(String[] args) {
        final int age = 20;
//        age = 100;
        System.out.println(age);
    }
}
