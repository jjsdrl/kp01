package day20231114;

public class TestSix {
    public static void main(String[] args) {
//        创建一个接口Flyable，具有抽象方法fly()。然后创建两个类Plane和 Bird，实现Flyable接口，
//        并在每个类中实现fly()方法以模拟各自飞的过程。在main方法中，创建Plane和 Bird对象，并调用它们的play()方法。
    }
}
interface Flyable{
    void fly();
}
class Plane implements Flyable{
    @Override
    public void fly() {
        System.out.println("飞机在飞");
    }
}
class Bird implements Flyable{
    @Override
    public void fly() {
        System.out.println("鸟在飞");
    }
}