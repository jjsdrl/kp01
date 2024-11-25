package day20231102;

public interface Fly {
    String time="一直飞行";
    static void fly(){
        System.out.println("具有飞行的能力！！！");

    }

    default void transport(){
        System.out.println("具有运输的能力！！！");
    }

}

class Plane implements Fly{

}
class TestFly{
    public static void main(String[] args) {
        Fly.fly();
        System.out.println(Fly.time);
        Fly plane = new Plane();
        plane.transport();
    }
}