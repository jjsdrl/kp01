package day20231020;

public class Animal {
    public Animal(){
        System.out.println("父类中的构造方法被加载了！！！");
    }

//    public Animal(String name){
//        System.out.println("父类中的构造方法被加载了！！！");
//    }

    static {
        System.out.println("父类中的静态代码块被加载了！！！");
    }

    {
        System.out.println("父类中的非静态代码块被加载了！！！");
    }
}
class Dog extends Animal{
    public Dog(){
        System.out.println("子类中的构造方法被加载了！！！");
    }

    static {
        System.out.println("子类中的静态代码块被加载了！！！");
    }

    {
        System.out.println("子类中的非静态代码块被加载了！！！");
    }

}
class TestDog{
    public static void main(String[] args) {

        new Dog();

    }
}